/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int swaps(ArrayList<Integer> row)
    {
        int n=row.size();
        int swap=0;
        ArrayList<Integer> sorted=new ArrayList<>(row);
        Collections.sort(sorted);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(sorted.get(i),i);
        }
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            while(!visited[i] && row.get(i)!=sorted.get(i)){
                int index=map.get(row.get(i));
                Collections.swap(row,i,index);
                swap++;
            }
            visited[i]=true;
        }
        return swap;
    }

    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> row=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node==null)
            {
                adj.add(new ArrayList<>(row));
                row.clear();
                if(!q.isEmpty()) q.add(null);
            }
            else{ row.add(node.val);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            }
        }
        int count=0;
        for(int i=0;i<adj.size();i++)
        {
            count+=swaps(adj.get(i));
        }
        return count;
    }
}
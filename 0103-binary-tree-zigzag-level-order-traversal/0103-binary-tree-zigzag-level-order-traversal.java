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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int i=0;
        List<Integer> row=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            if(temp==null)
            {
                if(i%2!=0)
                {
                    Collections.reverse(row);
                    ans.add(new ArrayList<>(row));
                    row.clear();
                    i++;
                }
                else
                {
                    ans.add(new ArrayList<>(row));
                    row.clear();
                    i++;
                }
                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                row.add(temp.val);
                if(temp.left!=null)  q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                
            }
        }
        return ans;
    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lo=new ArrayList<>();
        if(root==null) return lo;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> a=new ArrayList<>();
        while(!q.isEmpty())
        {
            
            TreeNode temp=q.poll();
            if(temp==null)
            {
                lo.add(new ArrayList<>(a));
                a.clear();
                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                a.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return lo;
    }
}
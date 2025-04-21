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
    public int findBottomLeftValue(TreeNode root) {
        int ans=root.val;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(r==null)
            {
                if(!q.isEmpty()){
                    ans=q.peek().val;
                    q.add(null);
                }

            }
            else
            {
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
        }
        return ans;
    }
}
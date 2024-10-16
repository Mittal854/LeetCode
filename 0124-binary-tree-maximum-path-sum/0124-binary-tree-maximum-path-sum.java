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
    private int global_max=Integer.MIN_VALUE;
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(sum(root.left),0);
        int right=Math.max(sum(root.right),0);
        global_max=Math.max(global_max,left+right+root.val);
        int ans=Math.max(left,right)+root.val;
        return ans;
        
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        
        sum(root);
        return global_max;
        
    }
}
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
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        int ans=Math.max(left,right)+1;
        return ans;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        
        if(Math.abs(left-right)>1) return false;
        
        boolean left1=isBalanced(root.left);
        boolean right1=isBalanced(root.right);
        if(!left1 || !right1) return false;
        
        return true;
    }
}
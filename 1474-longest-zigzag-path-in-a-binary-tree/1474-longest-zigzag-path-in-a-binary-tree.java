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
    int maxL=0;
    public void helper(TreeNode root,boolean isLeft,int curr)
    {
        if(root==null) return;
        maxL=Math.max(maxL,curr);
        if(isLeft)
        {
            helper(root.right,!isLeft,curr+1);
            helper(root.left,isLeft,1);
        }
        else
        {
            helper(root.left,!isLeft,curr+1);
            helper(root.right,isLeft,1);
        }
    }
    public int longestZigZag(TreeNode root) {
        if(root==null) return 0;
        helper(root.left,true,1);
        helper(root.right,false,1);
        return maxL;
    }
}
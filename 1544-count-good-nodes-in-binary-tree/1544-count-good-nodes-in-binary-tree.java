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
    public int helper(TreeNode root,int max)
    {
        if(root==null) return 0;
        int nodes=0;
        if(root.val>=max) nodes++;
        max=Math.max(root.val,max);
        nodes+=helper(root.left,max);
        nodes+=helper(root.right,max);
        return nodes;
    }
    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
    }
}
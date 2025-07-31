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
    int ans=0;
    public void helper(TreeNode root,int curr)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            ans+=curr*10+root.val;
            return;
        }
        helper(root.left,curr*10+root.val);
        helper(root.right,curr*10+root.val);
        return;
    }
    public int sumNumbers(TreeNode root) {
        
        helper(root,0);

        return ans;
    }
}
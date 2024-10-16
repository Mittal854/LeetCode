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
        if(root==null)
        {
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int ans=Math.max(left,right)+1;
        return ans;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) 
        {
            return 0;
        }
        int op1=diameterOfBinaryTree(root.left);
        int op2=diameterOfBinaryTree(root.right);
        int op3=height(root.left)+height(root.right);
        
        int ans=Math.max(op1,Math.max(op2,op3));
        
        return ans;
    }
}
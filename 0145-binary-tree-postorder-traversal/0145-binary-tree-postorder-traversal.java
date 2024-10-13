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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post=new ArrayList<>();
        if(root==null)
        {
            return post;
        }
        List<Integer> left=postorderTraversal(root.left);
        List<Integer> right=postorderTraversal(root.right);
        
        post.addAll(left);
        post.addAll(right);
        post.add(root.val);
        return post;
    }
}
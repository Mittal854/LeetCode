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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        if(root==null)
        {
            return in;
        }
        List<Integer> left=inorderTraversal(root.left);
        
        List<Integer> right=inorderTraversal(root.right);
        in.addAll(left);
        in.add(root.val);
        in.addAll(right);
        return in;
    }
}
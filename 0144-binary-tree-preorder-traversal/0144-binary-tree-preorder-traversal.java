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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre=new ArrayList<>();
        if(root==null)
        {
            return pre;
        }
        pre.add(root.val);
        List<Integer> left=preorderTraversal(root.left);
        List<Integer> right=preorderTraversal(root.right);
        pre.addAll(left);
        pre.addAll(right);
        return pre;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public int getVal(String traversal, int n, int[] pos) {
        int val = 0;
        while (pos[0] < n && Character.isDigit(traversal.charAt(pos[0]))) {
            val = val * 10 + (traversal.charAt(pos[0]) - '0');
            pos[0]++;
        }
        return val;
    }

    public int getDash(String traversal, int n, int[] pos) {
        int original_length = pos[0];
        while (pos[0] < n && traversal.charAt(pos[0]) == '-') {
            pos[0]++;
        }
        return pos[0] - original_length;
    }

    public void helper(TreeNode curr, String traversal, int expected_length, int n, int[] pos) {
        if(pos[0]==n) return;
        int original=pos[0];
        int dashL=getDash(traversal,n,pos);
        if(dashL!=expected_length)
        {
            pos[0]=original;
            return;
        }
        int val=getVal(traversal,n,pos);
        TreeNode newNode=new TreeNode(val);
        if(curr.left==null)
        {
            curr.left=newNode;
        }
        else
        {
            curr.right=newNode;
        }
        helper(newNode,traversal,expected_length+1,n,pos);
        helper(newNode,traversal,expected_length+1,n,pos);
    }

    public TreeNode recoverFromPreorder(String traversal) {
        int[] pos = new int[1];
        int n = traversal.length();
        if (n == 0)
            return null;
        TreeNode root = new TreeNode(getVal(traversal, n, pos));
        helper(root, traversal, 1, n, pos);
        helper(root, traversal, 1, n, pos);
        return root;
    }
}
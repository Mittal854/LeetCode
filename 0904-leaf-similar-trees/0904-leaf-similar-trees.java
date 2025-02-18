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
    public void isLeaf(TreeNode root,ArrayList<Integer>leafs)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            leafs.add(root.val);
            return;
        }
        isLeaf(root.left,leafs);
        isLeaf(root.right,leafs);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>leafs1=new ArrayList<>();
        ArrayList<Integer>leafs2=new ArrayList<>();
        isLeaf(root1,leafs1);
        isLeaf(root2,leafs2);
        return leafs1.equals(leafs2);
    }
}
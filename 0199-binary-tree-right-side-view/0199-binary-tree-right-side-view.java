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
    void tRight(TreeNode root,List<Integer> ans,int d)
    {
        if(root==null) return;
        if(d==ans.size())
        {
            ans.add(root.val);
        }
        tRight(root.right,ans,d+1);
        tRight(root.left,ans,d+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        tRight(root,ans,0);
        return ans;
    }
}
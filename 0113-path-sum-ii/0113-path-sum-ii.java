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
    public boolean helper(int targetSum,TreeNode root, List<Integer>curr,List<List<Integer>>ans)
    {
        if(root==null) return false;
        if(root.left==null && root.right==null)
        {
            if(targetSum-root.val==0)
            {
                curr.add(root.val);
                ans.add(new ArrayList<>(curr));
                curr.remove(curr.size()-1);
                return true;
            }
            return false;

        }
        curr.add(root.val);
        boolean left=helper(targetSum-root.val,root.left,curr,ans);
        boolean right=helper(targetSum-root.val,root.right,curr,ans);
        curr.remove(curr.size()-1);
        return left||right;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        helper(targetSum,root,curr,ans);
        return ans;
    }
}
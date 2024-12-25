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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        int maxi=Integer.MIN_VALUE;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            if(temp==null)
            {
                ans.add(maxi);
                maxi=Integer.MIN_VALUE;
                if(!q.isEmpty()) q.add(null);
            }
            else
            {
                maxi=Math.max(maxi,temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        return ans;
    }
}
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
    public int maxLevelSum(TreeNode root) {
        int level=1;
        int maxS=Integer.MIN_VALUE;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum=0;
        int ans=0;
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node==null)
            {
                if(sum>maxS)
                {
                    maxS=sum;
                    ans=level;
                }
                sum=0;
                level++;
                if(!q.isEmpty()) q.add(null);
            }
            else
            {
                sum+=node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }
        return ans;
        
    }
}
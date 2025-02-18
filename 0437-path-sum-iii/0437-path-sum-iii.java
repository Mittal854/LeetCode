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
    public int helper(TreeNode root,long targetSum,long curr,HashMap<Long,Integer>map)
    {
        if(root==null) return 0;
        int path=0;
        curr+=root.val;
        if(curr==targetSum) path++;
        path+=map.getOrDefault(curr-targetSum,0);
        map.put(curr,map.getOrDefault(curr,0)+1);
        path+=helper(root.left,targetSum,curr,map);
        path+=helper(root.right,targetSum,curr,map);
        map.put(curr,map.get(curr)-1);
        return path;
    }
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer>map=new HashMap<>();
        return helper(root,targetSum,0,map);
    }
}
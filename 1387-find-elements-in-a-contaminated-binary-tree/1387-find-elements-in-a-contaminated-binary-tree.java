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
class FindElements {
    HashSet<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<>();
        root.val = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            set.add(temp.val);
            if (temp.left != null) {
                temp.left.val = 2 * temp.val + 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.val = 2 * temp.val + 2;
                q.add(temp.right);
            }
        }
    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
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
    public int maxDepth(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> p = new Stack<>();
        p.push(new Pair<>(root, 1));
        int res = 0;
        while (!p.isEmpty()) {
            Pair<TreeNode, Integer> curr = p.pop();
            TreeNode node = curr.getKey();
            int depth = curr.getValue();
            if (node != null) {
                res = Math.max(res, depth);
                p.push(new Pair<>(node.left, depth+1));
                p.push(new Pair<>(node.right, depth+1));
            }
        }
        return res;
        
    }
}

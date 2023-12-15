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
    int max = 0;
    public int maxDepth(TreeNode root) {
         l(root, 1);
         return max;
    }

    void l(TreeNode node, int level) {
        if(node == null) return;
        max = Math.max(level, max);
        if(node.left != null) {
             l(node.left, level + 1);
        }
        if(node.right != null) {
            l(node.right, level + 1);
        }
    }
}

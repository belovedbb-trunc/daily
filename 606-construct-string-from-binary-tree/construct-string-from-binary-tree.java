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
    public String tree2str(TreeNode root) {
        StringBuilder m = new StringBuilder();
        traverse(root, m);
        return m.toString();
    }

    void traverse(TreeNode node, StringBuilder m) {
        if(node == null) return;
        m.append(node.val);
        if(node.left != null) {
            m.append("(");
            traverse(node.left, m);
            m.append(")");
        }
        if(node.right != null) {
            if(node.left == null) m.append("()");
            m.append("(");
            traverse(node.right, m);
            m.append(")");
        }
    }
}

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        traverse(root, val);
        return root;
    }

    void traverse(TreeNode node, int val) {
        if(node == null) return;
        if(val < node.val) {
            if(node.left != null) {
                traverse(node.left, val);
            }else {
                TreeNode ele = new TreeNode(val);
                node.left = ele;
            }
        }else {
            if(node.right != null) {
                traverse(node.right, val);
            }else {
                TreeNode ele = new TreeNode(val);
                node.right = ele;
            }
        }

    }
}
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
    int total = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        recurse(root, low, high);
        return total;
    }
    
    private void recurse(TreeNode node, int low, int high) {
        if(node == null) return ;
        if(node.left != null) {
            recurse(node.left, low, high);
        }
        if(node.val >= low && node.val <= high) total += node.val;
        if(node.right != null) {
            recurse(node.right, low, high);
        }
    }
}

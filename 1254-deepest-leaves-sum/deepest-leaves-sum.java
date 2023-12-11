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
    int total = 0, l = 0;
    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 0);
        return total;
    }

    void traverse(TreeNode node, int level) {
        if(node == null) return;
        if(node.left != null) {
            traverse(node.left, level + 1);
        }
        if(node.right != null) {
            traverse(node.right, level + 1);
        }
        
        if(level > l)  {
            total = node.val;
            l = level;
        }else if(level == l) {
            total += node.val;
        }
    }
}
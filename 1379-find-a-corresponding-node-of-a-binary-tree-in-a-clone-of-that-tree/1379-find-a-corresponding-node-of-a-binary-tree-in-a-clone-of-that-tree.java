/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode node;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        recurse(original, cloned, target);
        return node;
    }

    void recurse(TreeNode original, TreeNode cloned, TreeNode target) {
        if(original == null) return;
        if(node != null) return;
        if(original == target) {
            node = cloned;
            return ;
        }
        if(original.left != null) {
         recurse(original.left, cloned.left, target);
        }
        if(original.right != null) {
            recurse(original.right, cloned.right, target);
        }
    }
}
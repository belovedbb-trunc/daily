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
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recurse(root, p, q);
        return res;
    }

    void recurse(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null || res != null) return;
        if( (node.val >= p.val && node.val <= q.val) || (node.val <= p.val && node.val >= q.val) ) {
            res = node;
            return;
        }

        if(node.val > p.val && node.val > q.val ) {
            recurse(node.left, p, q);
        }
        if(node.val < p.val && node.val < q.val ) {
            recurse(node.right, p, q);
        }

    }
}

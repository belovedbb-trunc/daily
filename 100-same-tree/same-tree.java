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
    boolean res = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        iterate(p, q);
        return res;
    }

    void iterate(TreeNode p, TreeNode   q) {
        if( (p == null && q == null) || !res) return;
        if((p == null && q != null) || (q == null && p != null)) {
            res = false;
            return;
        }
        if(p.val != q.val) {
            res = false;
            return;
        }
        iterate(p.left, q.left);
        iterate(p.right, q.right);
    
    }
}
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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        return findSecondMinimumValue(root, root.val);
    }
    int findSecondMinimumValue(TreeNode root, int min) {
        if(root == null) return -1;
        if(root.val > min) return root.val;
        int lmin = findSecondMinimumValue(root.left, min);
        int rmin = findSecondMinimumValue(root.right, min);
        if(lmin == -1 || rmin == -1) {
            return Math.max(lmin , rmin);
        }
        return Math.min(lmin, rmin);

    }
}
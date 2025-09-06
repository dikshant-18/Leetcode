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
    public Integer prev = null;
    int mindif = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inord(root);
        return mindif;
    }
    public void inord(TreeNode node) {
        if(node == null) return ;
        inord(node.left);
        if(prev != null) {
            mindif = Math.min(mindif, node.val - prev);
        }
        prev = node.val;
        inord(node.right);
    }
}
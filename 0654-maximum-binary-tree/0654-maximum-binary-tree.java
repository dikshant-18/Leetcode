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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums , 0 , nums.length - 1);
    }
    TreeNode build(int[] nums, int left, int right) {
        if (left> right) return null;
        int maxind = left;
        for(int i = left; i <= right; i++) {
            if(nums[i] > nums[maxind]) maxind = i;
        }
        TreeNode root = new TreeNode(nums[maxind]);
        root.left = build(nums, left, maxind - 1);
        root.right = build(nums, maxind + 1, right);
        return root;
    }
}
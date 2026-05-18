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
    private Map<Integer, Integer> freq = new HashMap<>();
    private int maxFreq = 0;

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[]{};

        inorder(root);

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        return modes.stream().mapToInt(Integer::intValue).toArray();
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);
        freq.put(node.val, freq.getOrDefault(node.val, 0) + 1);
        maxFreq = Math.max(maxFreq, freq.get(node.val));
        inorder(node.right);
    }
}
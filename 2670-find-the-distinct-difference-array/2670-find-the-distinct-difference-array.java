class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            java.util.HashSet<Integer> prefix = new java.util.HashSet<>();
            for (int j = 0; j <= i; j++) {
                prefix.add(nums[j]);
            }
            java.util.HashSet<Integer> suffix = new java.util.HashSet<>();
            for (int j = i + 1; j < n; j++) {
                suffix.add(nums[j]);
            }
            
            result[i] = prefix.size() - suffix.size();
        }
        
        return result;
    }
}
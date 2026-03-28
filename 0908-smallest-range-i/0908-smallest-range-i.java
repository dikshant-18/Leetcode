class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for(int v : nums) {
            max = Math.max(max, v);
            min = Math.min(min, v );
        }
        return Math.max(0, max - min - 2 * k);
    }
}
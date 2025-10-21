class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 1;
        int left = 0;
        int used = 0;

        for (int right = 0; right < n; right++) {
            while (left < right && (nums[right] - nums[left] > 2 * k || used > numOperations)) {
                left++;
                if (used > 0) used--;
            }
            res = Math.max(res, right - left + 1);
            used++;
        }

        return Math.min(res, numOperations + 1);
    }
}

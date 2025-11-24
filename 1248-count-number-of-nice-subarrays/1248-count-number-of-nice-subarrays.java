class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private int countAtMost(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        int left = 0;
        int count = 0;
        int odd = 0;

        for (int right = 0; right < nums.length; right++) {
            if ((nums[right] & 1) == 1) {
                odd++;
            }

            while (odd > k) {
                if ((nums[left] & 1) == 1) {
                    odd--;
                }
                left++;
            }


            count += right - left + 1;
        }

        return count;
    }
}
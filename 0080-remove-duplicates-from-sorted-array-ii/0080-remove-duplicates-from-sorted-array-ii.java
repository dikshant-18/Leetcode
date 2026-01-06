class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int m = 2;
        for(int i = 2; i < n; i++) {
            if(nums[i] != nums[m - 2]) {
                nums[m] = nums[i];
                m++;

            }
        }
        return m;
    }
}
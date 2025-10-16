class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int[] count = new int[value];
        for(int num : nums) {
            int remain = ((num % value) + value) % value;
            count[remain]++;
        }
        int mex = 0;
        while (true) {
            int remain = mex % value;
            if(count[remain] == 0) break;
            count[remain]--;
            mex++;
        }
        return mex;
    }
}
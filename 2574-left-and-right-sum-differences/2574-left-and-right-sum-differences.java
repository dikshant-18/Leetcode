class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int leftsum = 0;
        int totalsum = 0;
        for(int num : nums) {
            totalsum += num;
        }
        int rightsum = totalsum;
        for(int i = 0; i < nums.length; i++) {
            rightsum -= nums[i];
            res[i] = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
        }
        return res;
    }
}
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                b++;
                a += b;
            } else {
                b = 0;
            }
        }
        return a;
    }
}
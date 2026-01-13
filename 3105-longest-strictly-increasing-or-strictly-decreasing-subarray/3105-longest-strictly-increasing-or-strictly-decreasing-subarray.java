class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      int res = 1;
      int in = 1;
      int de = 1;
      for(int i = 1; i < nums.length; ++i) {
        in = nums[i] > nums[ i - 1] ? in + 1 : 1;
        de = nums[i] < nums[ i -  1] ? de + 1 : 1;
        res = Math.max(res, Math.max(in, de));
      }
      return res;
    }
}
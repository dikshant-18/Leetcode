class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int s = 0 , r = 0;
        for (int i = 0 ; i < n; i++) {
            s += nums[i];
            r += i *nums[i];
        }
        int res = r;
        for(int i = 1; i < n; i++) {
            r = r + s - n * nums[n - i];
            res = Math.max(res, r);
        }
        return res;
    }
}
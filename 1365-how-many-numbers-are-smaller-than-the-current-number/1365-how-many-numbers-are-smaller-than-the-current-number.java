class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        java.util.Arrays.sort(sorted);
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            int left = 0 , right = n;
            while(left < right) {
                int mid = left + (right - left) / 2;
                if(sorted[mid] >= nums[i]) {
                    right = mid;
                } else  {
                    left = mid + 1;
                }
            }
            res[i] = left;
        }
        return res;
    }
}
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ct = 0; 
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[j] -nums[i] == diff) {
                    for(int k = j + 1; k < n; k++) {
                        if(nums[k] -  nums[j] == diff) {
                            ct++;
                        }
                    }
                }
            }
        }
        return ct;
    } 
}
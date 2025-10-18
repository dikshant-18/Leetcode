class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        long last = Long.MIN_VALUE;
        for(int num : nums) {
            long left = num - k;
            long right = num + k;
            long next = Math.max(left , last + 1);
            if(next <= right) {
                count++;
                last = next;
            }
        }
        return count;
    }
}
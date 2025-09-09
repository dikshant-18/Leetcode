class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        int degree = 0, minLen = nums.length;
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }
            degree = Math.max(degree, count.get(nums[i]));
        }
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                minLen = Math.min(minLen, 
                        (nums.length - 1 >= first.get(num)) ?
                        (lastIndex(nums, num) - first.get(num) + 1) : minLen);
            }
        }
        return minLen;
    }

    private int lastIndex(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}


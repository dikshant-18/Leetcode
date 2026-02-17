class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        if (n == 0) return false;
        
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        if (n != max + 1) return false;
        
        int[] count = new int[max + 1];
        for (int num : nums) {
            if (num > max || num < 0) return false;
            count[num]++;
        }

        for (int i = 1; i < max; i++) {
            if (count[i] != 1) return false;
        }
        return count[max] == 2;
    }
}
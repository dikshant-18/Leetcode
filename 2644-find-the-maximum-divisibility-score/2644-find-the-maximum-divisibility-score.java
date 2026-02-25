class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxsc = 0;
        int res = Integer.MAX_VALUE;
        for(int div : divisors) {
            int sc = 0;
            for(int num : nums) {
                if(num % div == 0) {
                    sc++;
                }
            }
            if(sc > maxsc) {
                maxsc = sc;
                res = div;
            } else if (sc == maxsc) {
                res = Math.min(res, div);
            }
        }
        return res;
    }
}
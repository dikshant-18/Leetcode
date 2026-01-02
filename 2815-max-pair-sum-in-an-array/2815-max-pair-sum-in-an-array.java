class Solution {
    public int maxSum(int[] nums) {
        int[] b = new int[10];
        for(int i = 0; i < 10; i++) {
            b[i] = -1;
        }
        int res = -1;
        for(int x : nums) {
            int d = maxdigi(x);
            if(b[d] != -1) {
                res = Math.max(res, b[d] + x);
            }
            if(x > b[d]) {
                b[d] = x;
            }
        }
        return res;
    }
    int maxdigi(int n) {
        int max = 0;
        while(n > 0) {
            int digi = n % 10;
            if(digi > max) {
                max = digi;
            }
            n /= 10;
        }
        return max;
    }
}
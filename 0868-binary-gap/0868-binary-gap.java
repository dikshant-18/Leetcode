class Solution {
    public int binaryGap(int n) {
        int res = 0;
        int d = -32;
        while(n > 0) {
            if((n & 1) == 1) {
                res = Math.max(res, d);
                d = 0;
            }
            d++;
            n >>= 1;
        }
        return res;
    }
}
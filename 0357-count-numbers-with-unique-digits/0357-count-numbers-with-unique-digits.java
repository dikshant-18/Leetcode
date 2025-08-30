class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int tot = 10, ud = 9 , an = 9;
        for(int i = 2; i <= n && an > 0; i++) {
            ud = ud * an;
            tot += ud;
            an--;
        }
        return tot;
    }
}
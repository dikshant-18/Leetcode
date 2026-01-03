class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++) {
            int a = nums[i][i];
            if(isPrime(a)) {
                res = Math.max(res, a);
            }
            int j = n - 1 - i;
            int b = nums[i][j];
            if(isPrime(b)) {
                res = Math.max(res, b);
            }
        }
        return res;
    }
    boolean isPrime(int x) {
        if(x < 2) {
            return false;
        }
        if(x == 2 || x == 3) {
            return true;

        }
        if(x % 2 == 0) {
            return false;
        }
        for(int d = 3; d * d <= x; d += 2) {
            if(x % d == 0) {
                return false;

            }
        }
        return true;
    }
}
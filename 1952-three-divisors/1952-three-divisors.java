class Solution {
    public boolean isThree(int n) {
        int ct = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                ct++;
                if(i != n / i) ct++;
            }
        }
        return ct == 3;
    }
}
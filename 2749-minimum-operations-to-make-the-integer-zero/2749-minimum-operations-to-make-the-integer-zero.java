class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long tr = (long) num1 - (long) k * num2;
            if(tr < 0) break;
            if(Long.bitCount(tr) <= k && k <= tr) {
                return k;
            }
        }
        return -1;
    }
}
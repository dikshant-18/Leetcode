class Solution {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        long firstTrueIndex = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            if (coinsNeeded <= n) {
                firstTrueIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) firstTrueIndex;
    }
}
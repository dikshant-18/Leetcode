class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[query_row + 2] [query_row + 2];
        dp[0][0] = poured;
        for(int row = 0; row <= query_row; row++) {
            for(int glass = 0; glass <= row; glass++) {
                double overflow = (dp[row][glass] - 1.0) / 2.0;
                if (overflow > 0) {
                    dp[row + 1][glass] += overflow;
                    dp[row + 1][glass + 1] += overflow;
                }
            }
        }
        return Math.min(1, dp[query_row][query_glass]);
    }
}
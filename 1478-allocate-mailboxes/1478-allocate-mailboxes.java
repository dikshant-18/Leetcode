import java.util.Arrays;

class Solution {
    public int minDistance(int[] houses, int k) {
        Arrays.sort(houses);
        int n = houses.length;

        int[][] cost = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                cost[i][j] = cost[i + 1][j - 1] + houses[j] - houses[i];
            }
        }

        int[][] dp = new int[n][k + 1];
        final int INF = 1 << 30;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], INF);
        }

        for (int i = 0; i < n; i++) {
            dp[i][1] = cost[0][i];
            for (int m = 2; m <= k && m <= i + 1; m++) {
                for (int p = 0; p < i; p++) {
                    dp[i][m] = Math.min(dp[i][m], dp[p][m - 1] + cost[p + 1][i]);
                }
            }
        }

        return dp[n - 1][k];
    }
}
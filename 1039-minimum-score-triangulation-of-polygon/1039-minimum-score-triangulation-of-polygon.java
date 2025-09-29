class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] memo = new int[n][n];
        return solve(values, 0, n - 1, memo);
    }
    
    private int solve(int[] values, int i, int j, int[][] memo) {
        if (j - i < 2) return 0;
        if (memo[i][j] != 0) return memo[i][j];
        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int score = values[i] * values[k] * values[j]
                        + solve(values, i, k, memo)
                        + solve(values, k, j, memo);
            min = Math.min(min, score);
        }
        memo[i][j] = min;
        return min;
    }
}

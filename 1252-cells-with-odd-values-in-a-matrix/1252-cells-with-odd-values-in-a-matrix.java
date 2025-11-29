class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] idx : indices) {
            int r = idx[0];
            int c = idx[1];
            row[r]++;
            col[c]++;

        }
        int oddct = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0 ; j < n; j++) {
                if(((row[i] + col[j]) & 1) == 1) {
                    oddct++;
                }
            }
        }
        return oddct;
    }
}
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return new int[0];
        int n = grid[0].length;
        int[] cw = new int[n];
        for(int[] row : grid) {
            for(int j = 0; j < n; j++) {
                int w = String.valueOf(row[j]).length();
                cw[j] = Math.max(cw[j], w);
            }
        }
        return cw;
    }
}
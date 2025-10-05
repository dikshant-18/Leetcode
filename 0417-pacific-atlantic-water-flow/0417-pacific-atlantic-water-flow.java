class Solution {
    final int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            dfs(heights, pacific, i, 0, heights[i][0]);
            dfs(heights, atlantic, i, cols-1, heights[i][cols-1]);
        }
        for (int j = 0; j < cols; j++) {
            dfs(heights, pacific, 0, j, heights[0][j]);
            dfs(heights, atlantic, rows-1, j, heights[rows-1][j]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int x, int y, int prevHeight) {
        int rows = heights.length, cols = heights[0].length;
        if (x < 0 || y < 0 || x >= rows || y >= cols || visited[x][y]
            || heights[x][y] < prevHeight) {
            return;
        }
        visited[x][y] = true;
        for (int[] dir : directions) {
            dfs(heights, visited, x + dir[0], y + dir[1], heights[x][y]);
        }
    }
}

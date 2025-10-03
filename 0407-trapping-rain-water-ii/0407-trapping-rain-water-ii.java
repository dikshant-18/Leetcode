import java.util.*;

class Solution {
    class Cell implements Comparable<Cell> {
        int row, col, height;
        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }
        public int compareTo(Cell other) {
            return this.height - other.height;
        }
    }
    
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length, n = heightMap[0].length;
        if (m <= 2 || n <= 2) return 0;
        
        PriorityQueue<Cell> pq = new PriorityQueue<>();
        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        for (int j = 1; j < n - 1; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }
        
        int water = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int level = Integer.MIN_VALUE;
        
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            level = Math.max(level, cell.height);
            for (int[] d : dirs) {
                int nr = cell.row + d[0];
                int nc = cell.col + d[1];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    if (heightMap[nr][nc] < level) {
                        water += level - heightMap[nr][nc];
                    }
                    pq.offer(new Cell(nr, nc, heightMap[nr][nc]));
                }
            }
        }
        return water;
    }
}

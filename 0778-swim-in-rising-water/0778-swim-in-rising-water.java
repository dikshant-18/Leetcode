import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        boolean[][] seen = new boolean[n][n];
        pq.offer(new int[]{grid[0][0], 0, 0});
        seen[0][0] = true;

        int ans = 0;
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int h = cur[0], r = cur[1], c = cur[2];
            ans = Math.max(ans, h);
            if (r == n - 1 && c == n - 1) return ans;

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if (seen[nr][nc]) continue;
                seen[nr][nc] = true;
                pq.offer(new int[]{grid[nr][nc], nr, nc});
            }
        }
        return -1;
    }
}

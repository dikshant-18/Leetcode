class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int goal = (1 << n) - 1;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][1 << n];
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i, 1 << i});
            visited[i][1 << i] = true;
        }

        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int node = curr[0], mask = curr[1];
                if (mask == goal) return steps;
                for (int nei : graph[node]) {
                    int nextMask = mask | (1 << nei);
                    if (!visited[nei][nextMask]) {
                        queue.offer(new int[]{nei, nextMask});
                        visited[nei][nextMask] = true;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}

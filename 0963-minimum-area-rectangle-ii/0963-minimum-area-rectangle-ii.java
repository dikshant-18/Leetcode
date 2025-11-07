class Solution {
    public double minAreaFreeRect(int[][] points) {
        int n = points.length;
        Set<String> pointSet = new HashSet<>();
        for (int[] p : points) {
            pointSet.add(p[0] + "," + p[1]);
        }
        double minArea = Double.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (i == j || i == k || j == k) continue;
                    int[] p1 = points[i], p2 = points[j], p3 = points[k];
                    int[] v1 = {p2[0] - p1[0], p2[1] - p1[1]};
                    int[] v2 = {p3[0] - p1[0], p3[1] - p1[1]};
                    // Check perpendicular
                    if (v1[0] * v2[0] + v1[1] * v2[1] != 0) continue;
                    int px = p2[0] + p3[0] - p1[0];
                    int py = p2[1] + p3[1] - p1[1];
                    if (!pointSet.contains(px + "," + py)) continue;
                    double area = Math.hypot(v1[0], v1[1]) * Math.hypot(v2[0], v2[1]);
                    if (area > 0 && area < minArea) minArea = area;
                }
            }
        }
        return minArea == Double.MAX_VALUE ? 0.0 : minArea;
    }
}
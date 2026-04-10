class Solution {
    private int m;
    private int n;
    private int oc;
    private int nc; 
    private int[][] image;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.m = image.length;
        this.n = image[0].length;
        this.oc = image[sr][sc];
        this.nc = color;
        this.image = image;
        if (oc == nc) {
            return image;
        }

        dfs(sr, sc);
        return image;
    }
    private void dfs(int i, int j) {

        if (i < 0 || i >= m || j < 0 || j >= n || image[i][j] != oc) {
            return;
        }
        image[i][j] = nc;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}
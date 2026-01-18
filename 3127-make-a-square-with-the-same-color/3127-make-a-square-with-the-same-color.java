class Solution {
    public boolean canMakeSquare(char[][] grid) {
        final int[] dirs = {0, 0, 1, 1, 0};
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; ++j) {
                int c1 = 0 , c2 = 0;
                for(int k = 0; k < 4; k++) {
                    int x = i + dirs[k], y = j + dirs[k+1];
                    c1 += grid[x][y] == 'W' ? 1 : 0;
                    c2 += grid[x][y] == 'B' ? 1 : 0;
                }
                if(c1 != c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
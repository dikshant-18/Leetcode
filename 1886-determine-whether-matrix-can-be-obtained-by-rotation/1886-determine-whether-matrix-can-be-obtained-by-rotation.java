class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] current = mat;
        for (int k = 0; k < 4; k++) {
            if (equals(current, target)) {
                return true;
            }

            int[][] rotated = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[j][n - 1 - i] = current[i][j];
                }
            }
            current = rotated;
        }
        
        return false;
    }
    
    private boolean equals(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += mat[i][i];
            int j = n - 1 - i;
            if(j != i) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
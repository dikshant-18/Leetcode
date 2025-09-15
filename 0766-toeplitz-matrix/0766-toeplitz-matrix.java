class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int ro = 1; ro < r; ro++) {
            for(int co = 1; co < c; co++) {
                if(matrix[ro][co] != matrix[ro -1][co - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
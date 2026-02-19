class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow = 0;
        int maxOnes = 0;
        
        for (int i = 0; i < mat.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                onesCount += mat[i][j];
            }
            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                maxRow = i;
            }
        }
        
        return new int[]{maxRow, maxOnes};
    }
}

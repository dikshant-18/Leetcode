class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for(int[] oppp : ops) {
            m = Math.min(m, oppp[0]);
            n = Math.min(n, oppp[1]);
        }
        return m*n;
    }
}
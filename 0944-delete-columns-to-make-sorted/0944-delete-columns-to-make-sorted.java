class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        int m = strs[0].length();
        for(int c = 0; c < m; c++) {
            for(int r = 1; r < n; r++) {
                if (strs[r].charAt(c) < strs[r-1].charAt(c)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
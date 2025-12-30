class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int res = 0;
        int lst = -1;
        for(int i = 0; i < n; i++) {
            if(forts[i] == 0) continue;
            if(lst != -1 && forts[i] + forts[lst] == 0) {
                res = Math.max(res, i - lst - 1);
            }
            lst = i;
        }
        return res;
    }
}
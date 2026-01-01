class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] v = new boolean[n];
        int cur = 0;
        int stp = 1;
        while(!v[cur]) {
            v[cur] = true;
            cur = (cur + stp * k) % n;
            stp++;
        }
        int count = 0;
        for(boolean g : v) {
            if(!g) count++;
        }
        int[] res = new int[count];
        int indx = 0;
        for(int i = 0; i < n; i++) {
            if(!v[i]) {
                res[indx++] = i + 1;
            }
        }
        return res;
    }
}
class Solution {
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int s = 0;
        for(int x : machines) s += x;
        if(s % n != 0) return -1;
        int targ = s/n , res = 0, current =0;
        for(int x : machines) {
            int d = x - targ;
            current += d;
            res = Math.max(res, Math.max(Math.abs(current) , d));
        }
        return res;
    }
}
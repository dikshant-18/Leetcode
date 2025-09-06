class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            final int le = query[0];
            final int rig = query[1];
            ans += (getOperations(rig) - getOperations(le - 1) + 1) / 2;
        }
        return ans;
    }
    long getOperations(int n) {
        long res = 0;
        int ops = 0;
        for (int powerOfFour = 1; powerOfFour <= n; powerOfFour *= 4) {
            final int le = powerOfFour;
            final int rig = Math.min(n, powerOfFour * 4 - 1);
            res += (long) (rig - le + 1) * ++ops;
        }
        return res;
    }
}

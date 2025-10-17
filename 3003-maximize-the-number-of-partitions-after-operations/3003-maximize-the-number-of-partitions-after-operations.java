class Solution {
    Map<List<Integer>, Integer> memo = new HashMap<>();
    String s;
    int k;

    public int maxPartitionsAfterOperations(String s, int k) {
        this.s = s;
        this.k = k;
        return dfs(0, 0, 1);
    }

    private int dfs(int i, int curMask, int canChange) {
        if (i >= s.length()) return 1;

        List<Integer> key = List.of(i, curMask, canChange);
        if (memo.containsKey(key)) return memo.get(key);

        int bit = 1 << (s.charAt(i) - 'a');
        int newMask = curMask | bit;
        int ans;

        if (Integer.bitCount(newMask) > k)
            ans = dfs(i + 1, bit, canChange) + 1;
        else
            ans = dfs(i + 1, newMask, canChange);

        if (canChange > 0) {
            for (int j = 0; j < 26; ++j) {
                int changedMask = curMask | (1 << j);
                if (Integer.bitCount(changedMask) > k)
                    ans = Math.max(ans, dfs(i + 1, 1 << j, 0) + 1);
                else
                    ans = Math.max(ans, dfs(i + 1, changedMask, 0));
            }
        }
        memo.put(key, ans);
        return ans;
    }
}

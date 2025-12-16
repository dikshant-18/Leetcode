class Solution {
    private int best;
    private String s;
    private int n;

    public int maxUniqueSplit(String s) {
        this.s = s;
        this.n = s.length();
        this.best = 0;
        backtrack(0, new HashSet<>());
        return best;
    }
    private void backtrack(int index, HashSet<String> used) {
        if (used.size() + (n - index) <= best) {
            return;
        }

        if (index == n) {
            best = Math.max(best, used.size());
            return;
        }

        StringBuilder cur = new StringBuilder();
        for (int i = index; i < n; i++) {
            cur.append(s.charAt(i));
            String sub = cur.toString();
            if (!used.contains(sub)) {
                used.add(sub);
                backtrack(i + 1, used);
                used.remove(sub);
            }
        }
    }
}
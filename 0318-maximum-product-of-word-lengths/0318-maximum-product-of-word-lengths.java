class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] bm = new int[n];
        for(int i = 0; i < n; i++) {
            for(char c : words[i].toCharArray()) {
                bm[i] |= 1 << (c - 'a');
            }
        }
        int maxp = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if((bm[i] & bm[j]) == 0) {
                    int p = words[i].length() * words[j].length();
                    maxp = Math.max(maxp, p);
                }
            }
        }
        return maxp;
    }
}
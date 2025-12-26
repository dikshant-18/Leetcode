class Solution {
    public boolean checkAlmostEquivalent(String w1, String w2) {
        int[] dif = new int[26];

        for(int i = 0; i < w1.length(); i++) {
            dif[w1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < w2.length(); i++) {
            dif[w2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(Math.abs(dif[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
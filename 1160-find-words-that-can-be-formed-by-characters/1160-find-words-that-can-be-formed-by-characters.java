class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            int[] temp = count.clone();
            boolean ok = true;
            for (char c : word.toCharArray()) {
                if (temp[c - 'a'] <= 0) {
                    ok = false;
                    break;
                }
                temp[c - 'a']--;
            }
            if (ok) {
                res += word.length();
            }
        }
        return res;
    }
}
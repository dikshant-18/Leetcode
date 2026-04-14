class Solution {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int i = 0;
        while (i < s.length() && count < k) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            i++;
        }
        if (count == k) {
            return s.substring(0, i - 1);
        }
        return s;
    }
}
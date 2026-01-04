class Solution {
    public int countAsterisks(String s) {
        int b = 0;
        int ct = 0;
        for(char c : s.toCharArray()) {
            if(c == '|') {
                b++;
            } else if (c == '*') {
                if(b % 2 == 0) {
                    ct++;
                }
            }
        }
        return ct;
    }
}
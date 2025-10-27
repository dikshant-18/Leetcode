class Solution {
    public int numberOfBeams(String[] bank) {
        int p = 0;
        int b = 0;
        for(String row : bank) {
            int ct = 0;
            for(char c : row.toCharArray()) {
                if(c == '1') ct++;
            }
            if(ct > 0) {
                b += p * ct;
                p = ct;
            }
        }
        return b;
    }
}
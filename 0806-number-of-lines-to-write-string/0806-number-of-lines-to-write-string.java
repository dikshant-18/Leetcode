class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lns = 1;
        int clw = 0;
        for(int i = 0; i < s.length(); i++) {
            int cw = widths[s.charAt(i) - 'a'];
            if(clw + cw <= 100) {
                clw += cw;
            } else {
                lns++;
                clw = cw;
            }
        }
        return new int[] {lns, clw};
    }
}
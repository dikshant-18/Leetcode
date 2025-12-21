class Solution {
    public boolean checkZeroOnes(String s) {
        int mones = 0;
        int mzeroes = 0;
        int crones = 0;
        int crzeroes = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '1') {
                crones++;
                crzeroes = 0;
            } else {
                crzeroes++;
                crones = 0;
            }
            mones = Math.max(mones, crones);
            mzeroes = Math.max(mzeroes, crzeroes);
        }
        return mones > mzeroes;
    }
}
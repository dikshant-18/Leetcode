class Solution {
    public long minTime(int[] skill, int[] mana) {
        long sskill = 0;
        for(int s : skill) sskill += s;
        long prewdone = sskill * mana[0];
        for(int j = 1; j < mana.length; ++j) {
            long prepdone = prewdone;
            for(int i = skill.length - 2; i >= 0; --i) {
                prepdone -= (long) skill[i + 1]*mana[j - 1];
                prewdone = Math.max(prepdone , prewdone - (long) skill[i] * mana[j]);
            }
            prewdone += sskill * mana[j];
        }
        return prewdone;
    }
}
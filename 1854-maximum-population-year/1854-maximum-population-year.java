class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] delta = new int[101];
        final int offset = 1950;
        for (int[] log : logs) {
            int birth = log[0] - offset;
            int death  = log[1] - offset;
            ++delta[birth];
            --delta[death];
        }
        int maxPop = 0;
        int earliestYear = 0;
        int currPop = 0;
        for (int i = 0; i < delta.length; ++i) {
            currPop += delta[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                earliestYear = i;
            }
        }
        return earliestYear + offset;
    }
}
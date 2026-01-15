class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre = new int[101];
        for(int num : nums) {
            fre[num]++;
        }
        int maxfre = 0;
        int totl = 0;
        for(int f : fre) {
            if(f > maxfre) {
                maxfre = f;
                totl = f;
            } else if (f == maxfre) {
                totl += f;
            }
        }
        return totl;
    }
}
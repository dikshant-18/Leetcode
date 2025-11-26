class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums) {
            int dig = 0;
            int cur = num;
            while(cur != 0) {
                cur /= 10;
                dig++;

            }
            if(dig % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
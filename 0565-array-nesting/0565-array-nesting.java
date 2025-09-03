class Solution {
    public int arrayNesting(int[] nums) {
        int ml = 0;
        boolean[] v = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(!v[i]) {
                int length = 0;
                int cu = i;
                while(!v[cu]) {
                    v[cu] = true;
                    cu = nums[cu];
                    length++;
                }
                ml = Math.max(ml, length);
            }
        }
        return ml;
    }
}
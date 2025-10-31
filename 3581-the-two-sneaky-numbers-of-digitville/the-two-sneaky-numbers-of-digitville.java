class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length]; // nums.length is n+2, but we only care about marking seen
        int[] result = new int[2];
        int index = 0;
        
        for (int num : nums) {
            if (seen[num]) {
                result[index++] = num;
            } else {
                seen[num] = true;
            }
        }
        
        return result;
    }
}
import java.util.HashMap;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twosummap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (twosummap.containsKey(complement)) {
                return new int[] {twosummap.get(complement), i};

            }

            twosummap.put(nums[i], i);


        }
        return new int[] {};
        
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 2};
        int target = 6;
        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] +"]");
    }
}

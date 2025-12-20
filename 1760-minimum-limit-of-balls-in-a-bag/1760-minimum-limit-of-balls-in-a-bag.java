class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for (int x : nums) {
            right = Math.max(right, x);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (operationsNeeded(nums, mid) > maxOperations) {

                left = mid + 1;
            } else {

                right = mid;
            }
        }
        return left;
    }

    private int operationsNeeded(int[] nums, int penalty) {
        long ops = 0;
        for (int x : nums) {
            ops += (x - 1) / penalty;
        }

        return (int) ops;
    }
}
class Solution {

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int pairCount = 0;

        for (int j = 0; j < nums.size(); ++j) {
            int currentValue = nums.get(j);

            int threshold = target - currentValue;

            int boundaryIndex = search(nums, threshold, j);

            pairCount += boundaryIndex;
        }

        return pairCount;
    }
    private int search(List<Integer> nums, int targetValue, int rightBound) {
        int left = 0;
        int right = rightBound - 1;
        int firstTrueIndex = rightBound;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums.get(mid) >= targetValue) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return firstTrueIndex;
    }
}
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int maxValidLength = 0;
        int previousLength = 0;
        int currentLength = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            currentLength++;
           
            if (i == n - 1 || nums.get(i) >= nums.get(i + 1)) {
                
                maxValidLength = Math.max(maxValidLength,
                    Math.max(currentLength / 2, Math.min(previousLength, currentLength)));
                previousLength = currentLength;
                currentLength = 0;
            }
        }
        
        return maxValidLength >= k;
    }
}

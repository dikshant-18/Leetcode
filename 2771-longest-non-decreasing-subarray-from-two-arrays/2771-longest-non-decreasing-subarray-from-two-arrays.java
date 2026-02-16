class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int end1 = 1;
        int end2 = 1;  
        int maxLen = 1;
        
        for (int i = 1; i < n; i++) {
            int newEnd1 = 1;
            int newEnd2 = 1;
            if (nums1[i] >= nums1[i - 1]) {
                newEnd1 = Math.max(newEnd1, end1 + 1);
            }
            if (nums1[i] >= nums2[i - 1]) {
                newEnd1 = Math.max(newEnd1, end2 + 1);
            }
            
            if (nums2[i] >= nums1[i - 1]) {
                newEnd2 = Math.max(newEnd2, end1 + 1);
            }
            if (nums2[i] >= nums2[i - 1]) {
                newEnd2 = Math.max(newEnd2, end2 + 1);
            }
            
            end1 = newEnd1;
            end2 = newEnd2;
            maxLen = Math.max(maxLen, Math.max(end1, end2));
        }
        
        return maxLen;
    }
}
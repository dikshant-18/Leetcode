class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int num : nums1) {
            s1.add(num);
        }
        Set<Integer> intersection = new HashSet<>();
        for(int num : nums2) {
            if(s1.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection.stream().mapToInt(Integer::valueOf).toArray();
    }
}
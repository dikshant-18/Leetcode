class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        java.util.Map<Integer, Integer> freq = new java.util.HashMap<>();
        for(int x : arr) {
            freq.put(x , freq.getOrDefault(x,0) + 1);
        }
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for(int count : freq.values()) {
            if(!seen.add(count)) {
                return false;
            }
        }
        return true;
    }
}
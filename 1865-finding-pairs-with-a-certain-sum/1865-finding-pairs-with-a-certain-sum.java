class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freq2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.freq2 = new HashMap<>();
        for (int x : nums2) {
            freq2.put(x, freq2.getOrDefault(x, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        freq2.put(oldVal, freq2.get(oldVal) - 1);
        if (freq2.get(oldVal) == 0) {
            freq2.remove(oldVal);
        }
        nums2[index] += val;
        int newVal = nums2[index];
        freq2.put(newVal, freq2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int res = 0;

        for (int x : nums1) {
            int trgt = tot - x;
            res += freq2.getOrDefault(trgt, 0);
        }

        return res;
    }
}
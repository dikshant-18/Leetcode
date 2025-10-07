class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Map<Integer, Integer> lakeIdToFullDay = new HashMap<>();
        TreeSet<Integer> emptyDays = new TreeSet<>();
        for (int i = 0; i < n; ++i) {
            int lake = rains[i];
            if (lake == 0) {
                emptyDays.add(i);
                ans[i] = 1;
            } else {
                if (lakeIdToFullDay.containsKey(lake)) {
                    int lastFullDay = lakeIdToFullDay.get(lake);
                    Integer dryDay = emptyDays.higher(lastFullDay);
                    if (dryDay == null) {
                        return new int[] {};
                    }
                    ans[dryDay] = lake;
                    emptyDays.remove(dryDay);
                }
                lakeIdToFullDay.put(lake, i);
            }
        }
        return ans;
    }
}

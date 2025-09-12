class Solution {
    public int oddEvenJumps(int[] arr) {
        final int n = arr.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int[] inc = new int[n];
        int[] dec = new int[n];
        map.put(arr[n-1], n - 1);
        inc[n - 1] = 1;
        dec[n - 1] = 1;
        for(int i = n - 2; i >= 0; --i) {
            Map.Entry<Integer, Integer> lo = map.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> hi = map.floorEntry(arr[i]);
            if(lo != null)
            inc[i] = dec[lo.getValue()];
            if(hi != null)
            dec[i] = inc[hi.getValue()];
            map.put(arr[i], i);
        }
        int res = 0;
        for(int x : inc)
        res += x;
        return res;
    }
}
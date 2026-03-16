class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] ct = new int[10];
        for(int d : digits) {
            ct[d]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int num = 100; num < 1000; num += 2) {
            int[] need = new int[10];
            int temp = num;
            while(temp > 0) {
                need[temp % 10]++;
                temp /= 10;
            }
            boolean canform = true;
            for(int i = 0; i < 10; i++) {
                if(ct[i] < need[i]) {
                    canform = false;
                    break;
                }
            }
            if(canform) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
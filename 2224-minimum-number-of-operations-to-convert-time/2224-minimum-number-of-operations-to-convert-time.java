class Solution {
    public int convertTime(String current, String correct) {
        int cr = Integer.parseInt(current.substring(0,2)) * 60 + Integer.parseInt(current.substring(3));
        int tr = Integer.parseInt(correct.substring(0,2)) * 60 + Integer.parseInt(correct.substring(3));
        int dif = tr - cr;
        int ops = 0;
        int[] stp = {60, 15, 5, 1};
        for(int step : stp) {
            ops += dif / step;
            dif %= step;
        }
        return ops;
    }
}
public class Solution {
    public boolean judgeSquareSum(int c) {
        int r = (int) Math.sqrt(c);
        for (int l = 0; l <= r; l++) {
            int b = c - l * l;
            int sqrt = (int) Math.sqrt(b);
            if (sqrt * sqrt == b) {
                return true;
            }
        }
        return false;
    }
}

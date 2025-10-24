class Solution {
    public int nextBeautifulNumber(int n) {
        for (int candidate = n + 1; ; candidate++) {
            if (isNumericallyBalanced(candidate)) {
                return candidate;
            }
        }
    }
    boolean isNumericallyBalanced(int num) {
        int[] digitCount = new int[10];
        int temp = num;
        while (temp > 0) {
            digitCount[temp % 10]++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digitCount[digit] != digit) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
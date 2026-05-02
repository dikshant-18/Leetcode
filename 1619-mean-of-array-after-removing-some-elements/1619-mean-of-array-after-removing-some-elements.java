class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int offset  = n / 20;
        double sum = 0.0;
        for(int i = offset; i < n - offset; i++) {
            sum += arr[i];
        }
        return sum / (n - 2 * offset);
    }
}
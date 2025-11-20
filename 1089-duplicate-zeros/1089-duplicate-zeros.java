class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        for(int num : arr) {
            if(num == 0) {
                zeroes++;
            }
        }
        int i = n - 1;
        int j = n + zeroes - 1;
        while(i < j) {
            if(j < n) {
                arr[j] = arr[i];
            }
            if(arr[i] == 0) {
                j--;
                if(j < n) {
                    arr[j] = arr[i];
                }
            }
            i--;
            j--;
        }
    }
}
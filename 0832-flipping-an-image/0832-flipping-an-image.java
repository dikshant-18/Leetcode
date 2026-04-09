class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                if (row[left] == row[right]) {
                    row[left] ^= 1;
                    row[right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right) {
                row[left] ^= 1;
            }
        }
        return image;
    }
}
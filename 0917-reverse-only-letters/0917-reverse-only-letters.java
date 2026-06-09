class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(!Character.isLetter(arr[i])) {
                i++;
                continue;
            }
            if(!Character.isLetter(arr[j])) {
                j--;
                continue;
            }
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }
}
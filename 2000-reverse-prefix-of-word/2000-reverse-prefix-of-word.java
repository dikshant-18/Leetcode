class Solution {
    public String reversePrefix(String word, char ch) {
        int targetindx = word.indexOf(ch);
        
        if (targetindx == -1) {
            return word;
        }
        
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = targetindx;
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        return String.valueOf(charArray);
    }
}
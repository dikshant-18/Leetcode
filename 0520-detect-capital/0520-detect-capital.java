class Solution {
    public boolean detectCapitalUse(String word) {
        int ucasect = 0;
        for(char c : word.toCharArray()) {
            if(Character.isUpperCase(c)) {
                ucasect++;
            }
        }
        return ucasect == 0 || ucasect == word.length() || (ucasect == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
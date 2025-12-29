class Solution {
    public String greatestLetter(String s) {
        java.util.HashSet<Character> set = new java.util.HashSet<>();
        for(char c : s.toCharArray()) {
            set.add(c);
        }
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            char lower = (char) (ch + 32);
            if(set.contains(ch) && set.contains(lower)) {
                return String.valueOf(ch);
            }
        }
        return "";
    }
}
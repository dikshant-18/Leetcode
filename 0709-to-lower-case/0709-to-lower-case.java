class Solution {
    public String toLowerCase(String s) {
        final int dif = 'A' - 'a';
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] -= dif;
            }
        }
        return new String(chars);
    }
}
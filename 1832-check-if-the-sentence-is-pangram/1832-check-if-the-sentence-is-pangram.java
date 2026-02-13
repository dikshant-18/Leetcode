class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }
        for(boolean flag : seen) {
            if(!flag) {
                return false;
            }
        }
        return true;
    }
}
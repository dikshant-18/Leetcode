class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] wrds = sentence.split(" ");
        for(int i = 0; i < wrds.length; i++) {
            if(wrds[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[128];
        map[' '] = ' ';
        int ind = 0;
        for(char c : key.toCharArray()) {
            if(map[c] == 0) {
                map[c] = (char)('a' + ind++);
            }
        }
        char[] res = new char[message.length()];
        for(int i = 0; i < message.length(); i++) {
            res[i] = map[message.charAt(i)];
        }
        return new String(res);
    }
}
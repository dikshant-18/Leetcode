class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        String presrtd = "";
        for(String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String cursrtd = new String(chars);
            if(!cursrtd.equals(presrtd)) {
                res.add(word);
            }
            presrtd = cursrtd;
        }
        return res;
    }
}
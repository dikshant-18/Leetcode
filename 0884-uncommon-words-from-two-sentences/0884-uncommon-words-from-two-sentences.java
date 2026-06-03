class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        java.util.Map<String, Integer> count = new java.util.HashMap<>();
        for(String word : s1.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);

        }
        for(String word : s2.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        java.util.List<String> res = new java.util.ArrayList<>();
        for(String word : count.keySet()) {
            if(count.get(word) == 1) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }
}
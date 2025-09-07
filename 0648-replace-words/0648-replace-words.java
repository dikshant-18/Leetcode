class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    
    TrieNode root = new TrieNode();
    
    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEnd = true;
    }
    
    private String getPrefix(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) break;
            node = node.children[idx];
            prefix.append(c);
            if (node.isEnd) return prefix.toString();
        }
        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        for (String rootWord : dictionary) insert(rootWord);
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = getPrefix(words[i]);
        }
        return String.join(" ", words);
    }
}

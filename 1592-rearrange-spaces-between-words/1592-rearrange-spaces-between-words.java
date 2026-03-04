class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
        for (char character : text.toCharArray()) {
            if (character == ' ') {
                totalSpaces++;
            }
        }
        String[] words = text.trim().split("\\s+");

        if (words.length == 1) {
            return words[0] + " ".repeat(totalSpaces);
        }

        int spacesBetweenWords = totalSpaces / (words.length - 1);
        int remainingSpaces = totalSpaces % (words.length - 1);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);

            if (i < words.length - 1) {
                result.append(" ".repeat(spacesBetweenWords));
            }
        }

        result.append(" ".repeat(remainingSpaces));
      
        return result.toString();
    }
}
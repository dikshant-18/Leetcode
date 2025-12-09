class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                letters.append(c);
            }
        }
        
        int nLetters = letters.length();
        int nDigits = digits.length();
        
        if (Math.abs(nLetters - nDigits) > 1) {
            return "";
        }
        StringBuilder first = letters;
        StringBuilder second = digits;
        if (nDigits > nLetters) {
            first = digits;
            second = letters;
        }
        
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < first.length() && j < second.length()) {
            result.append(first.charAt(i++));
            result.append(second.charAt(j++));
        }
        
        if (i < first.length()) {
            result.append(first.charAt(i));
        }
        
        return result.toString();
    }
}
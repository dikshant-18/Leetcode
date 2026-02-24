class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            if (isSymmetric(num)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isSymmetric(int num) {
        String s = String.valueOf(num);
        int len = s.length();

        if (len % 2 != 0) {
            return false;
        }
        
        int half = len / 2;
        int leftsm = 0, rightsm = 0;

        for (int i = 0; i < half; i++) {
            leftsm += s.charAt(i) - '0';
        }

        for (int i = half; i < len; i++) {
            rightsm += s.charAt(i) - '0';
        }
        
        return leftsm == rightsm;
    }
}
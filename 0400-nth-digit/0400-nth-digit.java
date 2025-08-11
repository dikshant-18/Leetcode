class Solution {
    public int findNthDigit(int n) {
        long len = 1;
        long count = 9;
        long srt = 1;
        long en = n;
        while (en > len * count) {
            en -= len * count;
            len++;
            count *= 10;
            srt *= 10;

        }
        long number = srt + (en - 1)/ len;
        int index = (int) ((en - 1)%len);
        String s = Long.toString(number);
        return s.charAt(index)- '0';
    }
}
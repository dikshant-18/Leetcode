class Solution {
    public int rotatedDigits(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; ++i)
        if (isgdnum(i))
        ++answer;
        return answer;
    }
    boolean isgdnum(int i) {
        boolean isrotatd = false;
        for(final char c : String.valueOf(i).toCharArray()) {
            if(c == '0' || c == '1' || c == '8')
            continue;
            if(c == '2' || c == '5' || c == '6' || c == '9')
            isrotatd = true;
            else
            return false;
        }
        return isrotatd;
    }

}
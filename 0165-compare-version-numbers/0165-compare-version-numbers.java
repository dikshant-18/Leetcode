class Solution {
    public int compareVersion(String version1, String version2) {
        int num1 = version1.length(), num2 = version2.length();
        int i = 0, j = 0;
        while(i < num1 || j < num2) {
            int numb1 = 0 , numb2 = 0;
            while(i < num1 && version1.charAt(i) != '.') {
                numb1 = numb1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while(j < num2 && version2.charAt(j) != '.') {
                numb2 = numb2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            if(numb1 < numb2) return -1;
            if(numb1 > numb2) return 1;
            i++;
            j++;
        }
        return 0;
    }
}
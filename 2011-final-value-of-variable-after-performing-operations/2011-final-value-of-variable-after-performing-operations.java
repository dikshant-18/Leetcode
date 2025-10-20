class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i = 0;
        for(String op : operations) {
            if(op.charAt(1) == '+') {
                i++;
            } else {
                i--;
            }
        }
        return i;
    }
}
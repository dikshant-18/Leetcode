class Solution {
    public boolean isValidSerialization(String preorder) {
        int d = 1;
        for(String node : preorder.split(",")) {
            d--;
            if(d < 0) return false;
            if(!node.equals("#")) {
                d += 2;
            }
        }
        return d == 0;
    }
}
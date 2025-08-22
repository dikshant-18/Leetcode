class Solution {
    public int hammingDistance(int x, int y) {
        int dist = x ^ y;
        return Integer.bitCount(dist);
    }
}
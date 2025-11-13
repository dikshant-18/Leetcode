class Solution {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int curhght = 1;
        int[] count = new int[101];
        for(int height : heights){
            ++count[height];
        }
        for(int height : heights) {
            while(count[curhght] == 0) {
                ++curhght;
            }
            if(height != curhght) {
                ++ans;
            }
            --count[curhght];
        }
        return ans;
    }
}
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vstd = new boolean[rooms.size()];
        dfs(rooms, 0, vstd);
        for(boolean v : vstd) {
            if(!v) return false;
        }
        return true;
    }
    void dfs(List<List<Integer>> rooms, int room , boolean[] vstd) {
        vstd[room] = true;
        for(int key : rooms.get(room)) {
            if (!vstd[key]) {
                dfs(rooms, key , vstd);
            }
        }
        
    }
}
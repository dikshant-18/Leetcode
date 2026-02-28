import java.util.List;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int count = 0;
        int pivot = -1;    
        for (int i = 0; i + 1 < n; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                count++;
                pivot = i;
            }
        }
        if (count == 0) {
            return 0;
        }
        if (count > 1 || nums.get(n - 1) > nums.get(0)) {
            return -1;
        }
        return n - 1 - pivot;
    }
}
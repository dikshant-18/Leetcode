class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int[] count = new int[2];
        int totalSubstrings = 0;
      
        int left = 0;
      
        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right) - '0']++;
          
            while (count[0] > k && count[1] > k) {
            
                count[s.charAt(left) - '0']--;
                left++;
            }
          

            totalSubstrings += right - left + 1;
        }
      
        return totalSubstrings;
    }
}
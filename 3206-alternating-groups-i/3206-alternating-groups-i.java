class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        // Group size we're looking for
        int groupSize = 3;
      
        // Length of the colors array
        int arrayLength = colors.length;
      
        // Total count of valid alternating groups
        int alternatingGroupCount = 0;
      
        // Current consecutive alternating elements count
        int currentAlternatingLength = 0;
      
        // Iterate twice through the array to handle circular nature
        // This ensures we check all possible groups that wrap around
        for (int i = 0; i < arrayLength * 2; i++) {
            // Get current index in the circular array
            int currentIndex = i % arrayLength;
            int previousIndex = (i - 1) % arrayLength;
          
            // Check if current element breaks the alternating pattern
            if (i > 0 && colors[currentIndex] == colors[previousIndex]) {
                // Reset counter when two adjacent elements have same color
                currentAlternatingLength = 1;
            } else {
                // Continue the alternating sequence
                currentAlternatingLength++;
            }
          
            // Only count groups in the second pass to avoid duplicates
            // If we have enough alternating elements, we found a valid group
            if (i >= arrayLength && currentAlternatingLength >= groupSize) {
                alternatingGroupCount++;
            }
        }
      
        return alternatingGroupCount;
    }
}
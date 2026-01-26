class Solution {
    public int smallestNumber(int n, int t) {
        for (int currentNumber = n; ; currentNumber++) {
            int digitProduct = 1;
            int tempnum = currentNumber;
            while (tempnum > 0) {
                int lastDigit = tempnum % 10;  
                digitProduct *= lastDigit;         
                tempnum /= 10;                   
            }
          
            if (digitProduct % t == 0) {
                return currentNumber;
            }
        }
    }
}
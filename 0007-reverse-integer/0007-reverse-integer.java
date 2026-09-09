class Solution {
    public int reverse(int x) {
        long reversed = 0; // Use long to effortlessly detect overflow
        
        while (x != 0) {
            int pop = x % 10; // Pop the last digit
            x /= 10;          // Remove the last digit from x
            
            reversed = (reversed * 10) + pop; // Push digit to the reversed total
            
            // Check overflow conditions
            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
                return 0;
            }
        }
        
        return (int) reversed;
    }
}
// Time Complexity: O(log10(x)) = O(d), where d is the number of digits in x
// Space Complexity: O(1)
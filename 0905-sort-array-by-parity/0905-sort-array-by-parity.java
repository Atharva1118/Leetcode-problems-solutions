class Solution { 
    public int[] sortArrayByParity(int[] nums) { 
        int j = 0; // Tracks the placement boundary for the next even number
        
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number is even
            if (nums[i] % 2 == 0) {
                // Swap the even number at i with the element at position j
                int temp = nums[i]; 
                nums[i] = nums[j]; 
                nums[j] = temp; 
                
                j++; // Advance the even marker position
            }
            // Odd numbers are left alone; the loop naturally moves 'i' forward
        } 
        return nums; 
    } 
}

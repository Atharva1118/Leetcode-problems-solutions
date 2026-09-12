class Solution {
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
    }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        // 1. Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // 3. Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
}


// Time complexity: O(n), where n is the length of nums. Each reverse call touches a portion of the array, and the three reverses collectively touch each element a constant number of times.

// Space complexity: O(1) extra space, since the rotation is done in place with a few local variables.
class Solution {
    public int pivotIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int left_sum=0;
            int right_sum=0;
            for(int j=0;j<i;j++){
                left_sum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                right_sum+=nums[j];
            }
            if(left_sum==right_sum){
                return i;
            }
        }
        return -1;
    }

        //Time complexity: O(n^2) in the worst case. For each index i (n times), we recompute the left sum (up to i elements) and the right sum (up to n−i−1 elements), leading to roughly n(n−1)/2 operations.

        // Space complexity: O(1) extra space. It uses a few integer accumulators and does not allocate any additional data structures.
}
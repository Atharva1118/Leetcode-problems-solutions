// class Solution {
//     public int pivotIndex(int[] nums) {

//         for(int i=0;i<nums.length;i++){
//             int left_sum=0;
//             int right_sum=0;
//             for(int j=0;j<i;j++){
//                 left_sum+=nums[j];
//             }
//             for(int j=i+1;j<nums.length;j++){
//                 right_sum+=nums[j];
//             }
//             if(left_sum==right_sum){
//                 return i;
//             }
//         }
//         return -1;
//     }

//         //Time complexity: O(n^2) in the worst case. For each index i (n times), we recompute the left sum (up to i elements) and the right sum (up to n−i−1 elements), leading to roughly n(n−1)/2 operations.

//         // Space complexity: O(1) extra space. It uses a few integer accumulators and does not allocate any additional data structures.
// }


class Solution {
    public int pivotIndex(int[] nums) {
        //Meta,Radius,Copang,Microsoft,Nvidia,etc.
        int right_sum=0;
        for(int i=0;i<nums.length;i++){
            right_sum+=nums[i];
        }
        int left_sum=0;
        for(int i=0;i<nums.length;i++){
            if(left_sum==right_sum-nums[i]){
                return i;
            }
            left_sum=left_sum+nums[i];
            right_sum=right_sum-nums[i];
        }
        return -1;
    }  
    // Time complexity: O(n). It traverses the array twice (one pass to compute the initial right_sum, and a second pass to check pivot and update sums), which is linear in the number of elements.

    // Space complexity: O(1). It uses a constant amount of extra variables (right_sum, left_sum, and a loop index), regardless of input size.   
}
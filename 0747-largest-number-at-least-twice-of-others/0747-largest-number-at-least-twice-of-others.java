// class Solution {
//     public int dominantIndex(int[] nums) {
//         //Google, Microsoft,Apple
//         int max=-1;
//         int idx=-1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max){
//                 max=nums[i];
//                 idx=i;
//             }
//         }
//         for(int i=0;i<nums.length;i++){
//             if(max==nums[i]){
//                 continue;
//             }
//             if(2*nums[i]<=max){
//                 continue;
//             }else{
//                 return -1;
//             }
//         }
//         return idx;
//         //Total time complexity: O(n). 
//         //Total space complexity: O(1).
//     }
// }


class Solution {
    public int dominantIndex(int[] nums) {
        //Google, Microsoft,Apple
        int max=-1;
        int secmax=-1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secmax=max;
                max=nums[i];
                
                idx=i;
            }else if (nums[i] > secmax) {
                secmax = nums[i]; // Update second max if it's between secmax and max
            }
        }
        if(2*secmax <= max){
            return idx;
        }
        return -1;
        //Total time complexity: O(n). 
        //Total space complexity: O(1).
    }
}
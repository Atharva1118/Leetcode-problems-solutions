// class Solution {
//     public int removeElement(int[] nums, int val) {
//         //Approach 1
//         int k=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=val){
//                 nums[k]=nums[i];
               
//                 k++;
//             }
//         }
//         return k;
//     }
//Time Complexity=O(n)
//Space Complexity=O(1)
// }

class Solution {

    public int removeElement(int[] nums, int val) {

        // Approach 2

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            if (nums[i] == val) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            } else {
                i++;
            }
        }

        return j + 1;
    }
//Time Complexity=O(n)
//Space Complexity=O(1)    
}
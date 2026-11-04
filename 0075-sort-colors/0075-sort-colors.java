// class Solution {
//     public void sortColors(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-1-i;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }

//     }
// }


//Brute Force Approach
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            if(nums[i]==1){
                count1++;
            }
            if(nums[i]==2){
                count2++;
            }
        }
        int index=0;
        while(count0 > 0) {
            nums[index++] = 0;
            count0--;
        }

        while(count1 > 0) {
            nums[index++] = 1;
            count1--;
        }

        while(count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }
}
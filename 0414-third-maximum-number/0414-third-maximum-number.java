// class Solution {
//     //Google,Adobe,TikTok,Bloomberg,Uber
//     public int thirdMax(int[] nums) {
// Time Complexity: O(n)
// Space Complexity: O(1)
//         Integer max1 = null;
//         Integer max2 = null;
//         Integer max3 = null;

//         for (Integer num : nums) {
//             // Skip duplicate values to ensure distinct maximums
//             if (num.equals(max1) || num.equals(max2) || num.equals(max3)) {
//                 continue;
//             }

//             // Shift values down as higher maximums are found
//             if (max1 == null || num > max1) {
//                 max3 = max2;
//                 max2 = max1;
//                 max1 = num;
//             } else if (max2 == null || num > max2) {
//                 max3 = max2;
//                 max2 = num;
//             } else if (max3 == null || num > max3) {
//                 max3 = num;
//             }
//         }

//         // If the third maximum doesn't exist, return the first maximum
//         return max3 == null ? max1 : max3;
//     }
// }
// 

// class Solution {
//     //Google,Adobe,TikTok,Bloomberg,Uber
//     //Time Complexity:O(nlogn)
//     //Space Complexity:O(1)
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         int i=0;
//         int j=nums.length-1;
//         while(i<j){
//             int temp=nums[i];
//             nums[i]=nums[j];
//             nums[j]=temp;
//             i++;
//             j--;
//         }
//         int elemCount=1;
//         for(int k=1;k<nums.length;k++){
//             if(nums[k]!=nums[k-1]){
//                 elemCount++;
//             }
//             if(elemCount==3){
//                 return nums[k];
//             }
//         }
//         return nums[0];
// Time Complexity: O(n log n)
// Space Complexity: O(log n)*


        
// }
// }

class Solution {
    //Google,Adobe,TikTok,Bloomberg,Uber
    //Time Complexity:O(nlogn)
    //Space Complexity:O(1)
    public int thirdMax(int[] nums) {
        Integer max1=null;
        Integer max2=null;
        Integer max3=null;
        for(int i=0;i<nums.length;i++){
            if(max1!=null && max1==nums[i]){
                continue;
            }
            if(max2!=null && max2==nums[i]){
                continue;
            }
            if(max3!=null && max3==nums[i]){
                continue;
            }
            if(max1==null || max1<nums[i]){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }else if (max2 == null || nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (max3 == null || nums[i] > max3) {
                max3 = nums[i];
            }
        }
    return max3 == null ? max1 : max3;
// Time Complexity: O(n)
// Space Complexity: O(1)
        
}
}

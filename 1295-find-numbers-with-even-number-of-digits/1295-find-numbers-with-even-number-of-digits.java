// class Solution {
//     public int findNumbers(int[] nums) {
        
//         int evencount=0;
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             while(nums[i]!=0){
                
                
//                 nums[i]=nums[i]/10;
//                 count++;
//             }
//             if(count%2==0){
//                 evencount++;
//             }
//         }
//         return evencount;
//     }
// }
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            if(s.length()%2==0){
                count++;
            }
        }
       return count;
    }
}
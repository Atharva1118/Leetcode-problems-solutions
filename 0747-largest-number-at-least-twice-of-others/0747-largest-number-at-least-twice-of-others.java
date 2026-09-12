class Solution {
    public int dominantIndex(int[] nums) {
        //Google, Microsoft,Apple
        int max=-1;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                continue;
            }
            if(2*nums[i]<=max){
                continue;
            }else{
                return -1;
            }
        }
        return idx;
        //Total time complexity: O(n). Total space complexity: O(1).
    }
}
class Solution {
    public int arrayPairSum(int[] nums) {
        //Google,BloomBerg,Amazon,Yahoo,Apple,Uber,etc.
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum=sum+nums[i];
            }
            
        }
        return sum;
    }
    //Time Complexity: O(n*logn)
    //Space Complexity: O(1)
}
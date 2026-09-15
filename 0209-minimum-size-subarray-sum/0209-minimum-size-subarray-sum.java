class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Meta,Googlr,Amazon,Goldman Sache,Microsoft,Amazon
        int minLength=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            
            sum=sum+nums[j];
             while (sum >= target) {
                minLength = Math.min(minLength, j - i + 1);
                sum -= nums[i]; // Remove the element at the left pointer
                i++; // Move the left pointer forward
            }
        }
         return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
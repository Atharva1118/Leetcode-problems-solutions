class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum=sum+i;
        }
        int abssum=0;
        for(int num:nums){
            while(num>0){
                int digit=num%10;
                abssum=abssum+digit;
                num=num/10;
            }
        }
        return sum-abssum;
    }
}
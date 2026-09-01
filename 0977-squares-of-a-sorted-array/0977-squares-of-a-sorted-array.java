class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] res=new int[nums.length];
       int i=res.length-1;
       int l=0;
       int r=nums.length-1;
       while(l<=r){
        if(Math.abs(nums[l])>Math.abs(nums[r])){
            res[i]=nums[l]*nums[l];
            i--;
            l++;
        }else{
            res[i]=nums[r]*nums[r];
            i--;
            r--;
        }
       } 
       return res;
    }
}
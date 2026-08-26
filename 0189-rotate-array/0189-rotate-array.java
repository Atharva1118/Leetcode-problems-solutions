class Solution {
    public void reverse(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    } 
    public void rotate(int[] nums, int k) {
        //nums = [1,2,3,4,5,6,7]
        //k=3
        //[5,6,7,1,2,3,4]
        int n=nums.length;
        if(k%n==0){
            return;
        }
        k=k%n;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    
}

//Time Complexity=O(n)
//Space Complexity=O(1)
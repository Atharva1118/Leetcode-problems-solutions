class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        
        while(low<=high){
            int mid=(low+high)/2;
            if((long) mid*mid==x){
                return mid;
            }else if((long) mid*mid<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
}
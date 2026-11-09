class Solution {
    public int smallestEvenMultiple(int n) {
        int i=n;
        if(n%2==0){
            return n;
        }else{
            return n*2;
        }
    }
}
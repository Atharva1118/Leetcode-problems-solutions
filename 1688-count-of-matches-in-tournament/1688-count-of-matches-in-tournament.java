class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        while(n>1){
            int trial=(n)/2;
            count=count+trial;
            n=(n+1)/2;
        }
        return count;
    }
}
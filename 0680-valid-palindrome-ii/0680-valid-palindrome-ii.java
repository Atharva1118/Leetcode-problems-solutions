class Solution {
    public boolean PalindromeHelper(int i,int j,String S){
        while(i<j){
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            i=i+1;
            j=j-1;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(left != right){
                return PalindromeHelper(i+1,j,s) || PalindromeHelper(i,j-1,s);
            }
            else{
                i=i+1;
                j=j-1;
            }
        }
        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
}

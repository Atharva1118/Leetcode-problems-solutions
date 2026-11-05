class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int difference=Math.abs(s.indexOf(s.charAt(i))-t.indexOf(s.charAt(i)));
            sum+=difference;
        }
        return sum;
    }
}
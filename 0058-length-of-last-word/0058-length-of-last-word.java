class Solution {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        int n=array.length;
        return array[n-1].length();

    }
}
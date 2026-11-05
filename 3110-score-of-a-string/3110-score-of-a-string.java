class Solution {
    public int scoreOfString(String s) {
        int totalsum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
            totalsum += difference;
        }

        return totalsum;
    }
}
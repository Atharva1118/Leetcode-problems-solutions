class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                min++;
                max++;
            } 
            else if (c == ')') {
                min--;
                max--;
            } 
            else { // '*'
                min--;  // '*' acts as ')'
                max++;  // '*' acts as '('
            }

            if (max < 0) {
                return false;
            }

            if (min < 0) {
                min = 0;
            }
        }

        return min == 0;
    }
}
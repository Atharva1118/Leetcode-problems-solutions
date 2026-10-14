
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num || sum < 1) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        while (sum >= 9 && ans.length() < num) {
            ans.append('9');
            sum -= 9;
        }

        if (sum > 0 && ans.length() < num) {
            ans.append((char) ('0' + sum));
        }

        while (ans.length() < num) {
            ans.append('0');
        }

        if (ans.charAt(0) == '0') {
            return "";
        }

        return ans.toString();
    }
}

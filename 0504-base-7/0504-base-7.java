
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        long n = num;
        boolean negative = n < 0;

        n = Math.abs(n);

        String str = "";

        while (n > 0) {
            str = (n % 7) + str;
            n = n / 7;
        }

        return negative ? "-" + str : str;
    }
}

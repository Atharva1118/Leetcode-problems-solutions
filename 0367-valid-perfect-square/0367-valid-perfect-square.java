class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        long left = 1;
        long right = num / 2; // For num > 1, the square root is never greater than num / 2

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

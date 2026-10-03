class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doubleDigit = 0;

        for (int num : nums) {
            if (num < 10) {
                single += num;
            } else {
                doubleDigit += num;
            }
        }

        return single != doubleDigit;
    }
}
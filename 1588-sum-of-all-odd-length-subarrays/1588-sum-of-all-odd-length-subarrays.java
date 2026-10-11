class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int len = 1; i + len <= arr.length; len += 2) {
                int subSum = 0;

                for (int j = i; j < i + len; j++) {
                    subSum += arr[j];
                }

                sum += subSum;
            }
        }

        return sum;
    }
}
class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) {
                continue;
            }

            boolean valid = true;

            for (int start = 0; start < n && valid; start += k) {
                int[] block = Arrays.copyOfRange(nums, start, start + k);
                Arrays.sort(block);

                for (int j = 0; j < k; j++) {
                    if (block[j] != sorted[start + j]) {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    break;
                }

                int descents = 0;
                for (int j = 0; j < k; j++) {
                    if (nums[start + j] > nums[start + (j + 1) % k]) {
                        descents++;
                    }
                }

                if (descents > 1) {
                    valid = false;
                }
            }

            if (valid) {
                ans += k;
            }
        }

        return ans;
    }
}
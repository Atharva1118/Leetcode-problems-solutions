
class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
            else if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }


        int front = Math.max(minIndex, maxIndex) + 1;

        int back = nums.length - Math.min(minIndex, maxIndex);

        int both = Math.min(minIndex, maxIndex) + 1
                 + nums.length - Math.max(minIndex, maxIndex);

        return Math.min(front, Math.min(back, both));
    }
}

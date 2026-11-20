class Solution {
    public int[] getConcatenation(int[] nums) {
        return java.util.stream.IntStream.concat(java.util.Arrays.stream(nums), java.util.Arrays.stream(nums)).toArray();
    }
}
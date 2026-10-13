class Solution {
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = binaryString.replaceAll("[^1]", "").length();
        return count;

    }
}
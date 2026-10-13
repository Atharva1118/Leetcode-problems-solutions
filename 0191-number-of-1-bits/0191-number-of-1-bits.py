class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        bits=str(bin(n))
        return bits.count("1")
        
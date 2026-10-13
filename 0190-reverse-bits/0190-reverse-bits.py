class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        binary_str = '{:032b}'.format(n)
        
        reversed_str = binary_str[::-1]
        
        return int(reversed_str, 2)

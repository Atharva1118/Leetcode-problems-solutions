class Solution(object):
    def numberGame(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        new=[]
        nums.sort()
        while len(nums)>0:
            new.append(nums.pop(1))
            new.append(nums.pop(0))
        return new

        
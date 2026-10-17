class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        diff = Counter(t) - Counter(s)
        return list(diff.keys())[0]
        
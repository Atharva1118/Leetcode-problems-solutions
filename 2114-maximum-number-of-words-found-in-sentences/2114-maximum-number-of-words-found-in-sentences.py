class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        maxlength=0
        curr=0
        for i in sentences:
            curr=len(i.split())
            maxlength=max(curr,maxlength)
        return maxlength
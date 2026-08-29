class Solution(object):
    def reverseWords(self, s):
        s=s.split()
        rev=s[::-1]
        rev_string=" ".join(rev)
        return rev_string


        
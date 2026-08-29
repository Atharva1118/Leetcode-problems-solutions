class Solution(object):
    def reverseWords(self, s):
        s=s.split()
        new_words=[]
        for i in s:
            new_words.append(i[::-1])

        result = " ".join(new_words)
        return result

        

        
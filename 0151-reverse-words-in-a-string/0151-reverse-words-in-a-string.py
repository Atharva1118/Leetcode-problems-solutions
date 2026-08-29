class Solution(object):
    def reverseWords(self, s):
# text = "Python is fun to learn"

# # 1. Split into a list of words
# word_list = text.split()

# # 2. Reverse the list using slicing
# reversed_list = word_list[::-1]

# # 3. Join the list back into a single string with spaces
# reversed_text = " ".join(reversed_list)

# print(reversed_text)
# Output: "learn to fun is Python"

        s=s.split()
        rev=s[::-1]
        rev_string=" ".join(rev)
        return rev_string


        
class Solution:
    def isValid(self, s):
        stack = []
        pairs = {
            ')': '(',
            ']': '[',
            '}': '{'
        }

        for b in s:
            if b in "([{":
                stack.append(b)
            else:
                if not stack:
                    return False

                top = stack.pop()

                if pairs[b] != top:
                    return False

        return not stack
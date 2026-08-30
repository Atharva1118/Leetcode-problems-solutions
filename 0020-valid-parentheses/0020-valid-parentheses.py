class Solution(object):
    def isValid(self, s):
        stack = []

        for b in s:
            if b in "([{":
                stack.append(b)
            else:
                if not stack:
                    return False

                top = stack.pop()

                if b == ')' and top != '(':
                    return False
                if b == ']' and top != '[':
                    return False
                if b == '}' and top != '{':
                    return False

        return not stack
        
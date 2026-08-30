class Solution(object):
    def isValid(self, s):
        stack = []

        for b in s:
            if b == '(':
                stack.append(')')
            elif b == '[':
                stack.append(']')
            elif b == '{':
                stack.append('}')
            elif not stack or stack.pop() != b:
                return False

        return not stack
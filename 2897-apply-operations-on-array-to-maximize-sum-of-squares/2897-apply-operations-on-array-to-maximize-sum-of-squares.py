
class Solution:
    def maxSum(self, nums, k):
        MOD = 10**9 + 7
        bits = [0] * 31

        for num in nums:
            while num:
                bit = num & -num
                bits[bit.bit_length() - 1] += 1
                num &= num - 1

        ans = 0
        for _ in range(k):
            num = 0

            for b in range(30, -1, -1):
                if bits[b] > 0:
                    num |= 1 << b
                    bits[b] -= 1

            ans = (ans + num * num) % MOD

        return ans

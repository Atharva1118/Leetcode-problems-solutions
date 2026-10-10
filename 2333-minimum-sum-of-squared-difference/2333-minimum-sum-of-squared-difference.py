
class Solution:
    def minSumSquareDiff(self, nums1, nums2, k1, k2):
        diff = [abs(a - b) for a, b in zip(nums1, nums2)]
        k = k1 + k2

        total = sum(diff)

        if k >= total:
            return 0

        left = 0
        right = max(diff)

        # Find the minimum possible maximum difference
        while left < right:
            mid = (left + right) // 2

            operations = sum(max(d - mid, 0) for d in diff)

            if operations <= k:
                right = mid
            else:
                left = mid + 1

        target = left

        # Reduce every difference to at most target
        used = 0
        ans = 0

        for d in diff:
            remaining = min(d, target)
            used += d - remaining
            ans += remaining * remaining

        # Distribute leftover operations
        extra = k - used
        ans -= extra * (2 * target - 1)

        return ans
class Solution(object):
    def findErrorNums(self, nums):
        n = len(nums)
        nset = set()
        dup = -1
        for num in nums:
            if num in nset:
                dup = num
            else:
                nset.add(num)
        msng = sum(range(1, n + 1)) - sum(nset)
        return [dup, msng]
        
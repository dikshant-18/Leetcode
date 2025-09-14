class Solution(object):
    def dominantIndex(self, nums):
        max = 0
        secmax = 0
        for i, num in enumerate(nums):
            if num > max:
                secmax = max
                max = num 
                res = i
            elif num > secmax:
                secmax = num
        return res if max >= 2 * secmax else -1
        
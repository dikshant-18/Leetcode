class Solution(object):
    def frequencySort(self, s):
        from collections import Counter
        fre = Counter(s)
        sorted_c = sorted(fre.items(), key = lambda x : -x[1])
        return ''.join(char*count for char , count in sorted_c)
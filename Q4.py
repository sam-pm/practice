import math

class Solution:
    def findMedianSortedArrays(self, l1, l2):
        combined = []

        # print(l1)
        # print(l2)
        for num in l1:
            combined.append(num)

        for num in l2:
            combined.append(num)

        combined.sort()

        # print(combined)
        
        if len(combined) % 2 == 0:
            middle = int(len(combined)/2)
            answer = (int(combined[middle]) + int(combined[middle-1]))/2
        else:
            middle = math.floor(len(combined))/2
            answer = combined[int(middle)]
        
        return answer

"""
Runtime: 112 ms, faster than 50.34% of Python3 online submissions for Median of Two Sorted Arrays.
Memory Usage: 13.9 MB, less than 5.71% of Python3 online submissions for Median of Two Sorted Arrays.

"""

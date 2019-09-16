from Q4 import Solution
import random

l1 = []
l2 = []

for x in range(random.randint(0,3)):
    l1.append(random.randint(0,9))

for x in range(random.randint(1,5)):
    l2.append(random.randint(0,9))


s = Solution()

answer = s.findMedianSortedArrays(l1, l2)

print(str(answer))

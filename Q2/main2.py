from Q3 import Solution

# create and Initialize
s = Solution()

str_1 = "aaaaa"
str_2 = "aab"
str_3 = "dvdf"
str_4 = "aaaaaaaaaaaab"

print1 = s.lengthOfLongestSubString(str_1)
print2 = s.lengthOfLongestSubString(str_2)
print3 = s.lengthOfLongestSubString(str_3)
print4 = s.lengthOfLongestSubString(str_4)

print(str_1 + " -> " + str(print1))
print(str_2 + " -> " + str(print2))
print(str_3 + " -> " + str(print3))
print(str_4 + " -> " + str(print4))

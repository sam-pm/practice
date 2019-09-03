class Solution:
	def twoSum(self, nums, target):

		# Variables for tracking
		answer = []
		dict= {}

		# Checking for membership in my dictionary and returning a list.
		for i, num in enumerate(nums):
			if num in dict:
				answer.append(dict[num])
				answer.append(i)
				break
			else:
				dict[target-num] = i

		return answer

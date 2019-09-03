class Solution:
	def twoSum(self, nums, target):

		# Variables for tracking
		answer = []
		temp_dict= {}

		# Checking for membership in my dictionary and returning a list.
		for i, num in enumerate(nums):
			if num in temp_dict:
				answer.append(temp_dict[num])
				answer.append(i)
				break
			else:
				temp_dict[target-num] = i

		return answer

class Solution:
	def twoSum(self, nums, target):
		index = 0
		while(index < len(nums)):
			if (target - nums[index] in nums):
				#then we want to add index and the index of the other number
				

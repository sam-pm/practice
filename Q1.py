class Solution:
	def twoSum(self, nums, target):
		#print("The target number is: "+str(target))
		answer = []
		for x in nums:
			if ((target - x) in nums and (target-x) != x):
				answer.append(nums.index(x))
				answer.append(nums.index(target-x))
				print(answer)
				break
		return answer

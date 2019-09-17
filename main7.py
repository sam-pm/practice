from Q7 import Solution
import random

flipped = 0
tries = 0
while(flipped == 0):
    x = random.randint(-2**40,2**40)
    print("The initial number is: " + str(x)) 
    s = Solution()
    flipped = s.reverse(x)
    print("The flipped number is: " + str(flipped))
    tries = tries + 1

print("The number of tries was: " + str(tries))

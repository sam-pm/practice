class Solution:
    def reverse(self, x):
        str_x = str(x)
        new_str = ""

        # Flip the string. 
        for i in range(0, len(str_x)):
            new_str = new_str + str_x[len(str_x)-1-i]

        new_str = new_str.replace("-", "")
        
        # If negative add sign
        if x < 0:
            new_str = "-" + new_str

        if int(new_str) > 2**31 - 1 or int(new_str) < -2**31:
            return 0
        else:
            return int(new_str)

"""
Runtime: 36 ms, faster than 84.51% of Python3 online submissions for Reverse Integer.
Memory Usage: 13.9 MB, less than 5.26% of Python3 online submissions for Reverse Integer.
"""


class Solution:
    def lengthOfLongestSubString(self, s):
        # Unlike java solution going to use sets for unique chars
        setCollect = []
        pq = [0]

        for x in s:
            setCollect.append(set([]))

        i = 0
        for charSet in setCollect:
            for char in s[i:len(s)]:
                if char in charSet:
                    break
                else:
                    charSet.add(char)
            pq.append(len(charSet))
            i = i+1
        return max(pq)
        
"""
Runtime: 492 ms, faster than 10.76% of Python online submissions for Longest Substring Without Repeating Characters.
Memory Usage: 267.5 MB, less than 6.25% of Python online submissions for Longest Substring Without Repeating Characters.
"""

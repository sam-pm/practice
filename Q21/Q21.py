from ListNode import ListNode

class Q21:
    def mergeTwoLists(self, l1, l2):
        # unwrap the nodes to an array
        combined = []
        
        while(l1 != None):
            combined.append(l1.val)
            l1 = l1.next

        while(l2 != None):
            combined.append(l2.val)
            l2 = l2.next

        # check length and sort
        if combined == []:
            return None

        combined.sort()

        # Build new list and return
        answer = ListNode(combined[0])
        temp = answer
        combined.pop(0)
        for x in combined:
            temp.next = ListNode(x)
            temp = temp.next

        return answer
    
"""
Runtime: 48 ms, faster than 26.42% of Python3 online submissions for Merge Two Sorted Lists.
Memory Usage: 13.7 MB, less than 6.61% of Python3 online submissions for Merge Two Sorted Lists.
"""

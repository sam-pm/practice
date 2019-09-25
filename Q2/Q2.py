from ListNode import ListNode

class Solution:
    def addTwoNumbers(self, list1, list2):

        # Collect the values in a list and flip it.
        str_num_1 = []
        while (list1 != None):
            str_num_1.append(str(list1.val))
            list1 = list1.next
        str_num_1.reverse()

        str_num_2 = []
        while (list2 != None):
            str_num_2.append(str(list2.val))
            list2 = list2.next
        str_num_2.reverse()

        # Combine and add
        str_num_1 = ''.join(str_num_1)
        str_num_2 = ''.join(str_num_2)
        added_nums = str(int(str_num_1)+int(str_num_2))

        # Flip anwser and return
        added_nums = added_nums[::-1]
        answer_list = ListNode(0)
        temp_node = answer_list
        for i, c in enumerate(added_nums):
            temp_node.val = c
            if i < len(added_nums)-1:
                temp_node.next = ListNode(0)
            temp_node = temp_node.next


"""
Runtime: 80 ms, faster than 56.79% of Python3 online submissions for Add Two Numbers.
Memory Usage: 14 MB, less than 5.67% of Python3 online submissions for Add Two Numbers.
"""

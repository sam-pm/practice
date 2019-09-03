class Solution:
    def addTwoNumbers(self, list1, list2):

        temp_l1 = list1
        # Will need to iterate through the link list node
        while (temp_l1 != None):
            print(str(temp_l1.val))
            temp_l1 = temp_l1.next

        temp_l2 = list2
        while (temp_l2 != None):
            print(str(temp_l2.val))
            temp_l2 = temp_l2.next

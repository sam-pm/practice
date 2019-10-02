from ListNode import ListNode
from Q21 import Q21

list1 = [4,5,6]
list2 = [1,2,3]

n1 = ListNode(list1[0])
n2 = ListNode(list2[0])
list1.pop(0)
list2.pop(0)

temp = n1
for x in list1:
    temp.next = ListNode(x)
    temp = temp.next

temp = n2
for x in list2:
    temp.next = ListNode(x)
    temp = temp.next


# Create the object and run the code 
s = Q21()

toPrint = s.mergeTwoLists(n1, n2)

while toPrint != None:
    print(toPrint.val)
    toPrint = toPrint.next

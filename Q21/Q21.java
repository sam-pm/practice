public class Q21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){

	System.out.println("List one values");
	while(l1 != null){
	    System.out.print(l1.val + " -> ");
	    l1 = l1.next;
	}

	System.out.println("\nList two values");
	while(l2 != null){
	    System.out.print(l2.val + " -> ");
	    l2 = l2.next;
	}

	System.out.println("\n");
	
	return null;
    }
}

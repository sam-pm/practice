import java.util.PriorityQueue;
import java.util.Arrays;

public class Q21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
	// Data stuctures and variables
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	ListNode answer, temp;
	
	// Unwrap the list nodes
	while(l1 != null){
	    pq.add(l1.val);
	    l1 = l1.next;
	}
	while(l2 != null){
	    pq.add(l2.val);
	    l2 = l2.next;
	}
	
	// Build new sorted list
	if(pq.peek() != null){
	    answer = new ListNode(pq.poll());
	    temp = answer;
	    while(pq.peek() != null){
		temp.next = new ListNode(pq.poll());
		temp = temp.next;
	    }
	}else{
	    answer = null;
	}
	
	// Return result
	return answer;
    }
}


/*
Runtime: 2 ms, faster than 21.50% of Java online submissions for Merge Two Sorted Lists.
Memory Usage: 38.4 MB, less than 19.53% of Java online submissions for Merge Two Sorted Lists.
*/

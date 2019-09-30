import java.util.Random;
import java.util.Arrays;

public class driver21{
    public static void main(String[] args){
	// Create and populate variables
	Q21 s = new Q21();
	int tr = 0;
	ListNode l1, l2, l3, l4, t1, t2, t3, t4;
	Random r = new Random();
	int[] i1 = new int[3];
	int[] i2 = new int[3];
	int[] i3 = new int[5];
	int[] i4 = new int[5];


	// Build the sorted ListNodes
	for(int i = 0; i < 3; i++){
	    i1[i] = r.nextInt(99);
	    i2[i] = r.nextInt(99);
	}
	for(int i = 0; i < 5; i++){
	    i3[i] = r.nextInt(99);
	    i4[i] = r.nextInt(99);
	}
	// Sort the lists
	Arrays.sort(i1);
	Arrays.sort(i2);
	Arrays.sort(i3);
	Arrays.sort(i4);
	l1 = new ListNode(i1[0]);
	l2 = new ListNode(i2[0]);
	t1 = l1;
	t2 = l2;
	for (int i = 1; i < i1.length; i++){
	    t1.next = new ListNode(i1[i]);
	    t2.next = new ListNode(i2[i]);
	    t1 = t1.next;
	    t2 = t2.next;
	}
	l3 = new ListNode(i3[0]);
	l4 = new ListNode(i4[0]);
	t3 = l3;
	t4 = l4;
	for (int i = 1; i < i3.length; i++){
	    t3.next = new ListNode(i3[i]);
	    t4.next = new ListNode(i4[i]);
	    t3 = t3.next;
	    t4 = t4.next;
	}

	
	// Tests
	System.out.println("TEST #1");
	ListNode test1 = s.mergeTwoLists(l1, l2);
	if(test1 != null){
	    nodePrint(l1);
	    nodePrint(l2);
	    nodePrint(test1);
	    tr++;
	}

	System.out.println("\nTEST #2");
	ListNode test2 = s.mergeTwoLists(l3, l4);
	if(test2 != null){
	    nodePrint(l3);
	    nodePrint(l4);
	    nodePrint(test2);
	    tr++;
	}

	
	// Results
	System.out.println("\nTesting Results");
	System.out.println(tr + "/2 tests passed");
	
    }

    public static void nodePrint(ListNode ln){
	System.out.print("List: ");
	while(ln != null){
	    if(ln.next != null){
		System.out.print(ln.val + " -> ");
		ln = ln.next;
	    }else{
		System.out.print(ln.val);
		break;
	    }
	}
	System.out.println("");
    }
    
}

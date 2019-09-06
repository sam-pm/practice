
public class Q2{

	// Default constructer is used for this class

	// Solution function
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){

	    System.out.println(l1.val);
	    System.out.println(l2.val);

	    //This is the point that the nodes need to be processed.
	    String temp_1 = "";
	    while(l1 != null){
		// Append the val to a string
		temp_1.concat(String.valueOf(l1.val));
		
		l1 = l1.next;
	    }

	    System.out.println("The value of the first appended string is: " + temp_1);

	    String temp_2 = "";
	    while (l2 != null){
		// Append the val to a string
		temp_2.concat(String.valueOf(l2.val));

		
		l2 = l2.next;
	    }

	    System.out.println("The value of the second appended string is: " + temp_2);

	    // add the numbers and convert the result to a reversed Node string

	    // Return answer Node
	    return null;
	}


}

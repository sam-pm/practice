
public class Q2{

    // Solution function
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
	
	// Iterate through each list and build a string
	String temp_1 = "";
	while(l1 != null){
	    temp_1 = temp_1 + Integer.toString(l1.val);	
	    l1 = l1.next;
	}
	String temp_2 = "";
	while (l2 != null){
	    temp_2 = temp_2 + Integer.toString(l2.val);
	    l2 = l2.next;
	}

	// Add the numbers and convert the result to a reversed Node string
	String string_answer = revStr(Integer.toString(Integer.parseInt(revStr(temp_1)) + Integer.parseInt(revStr(temp_2))));

	ListNode answerNode = new ListNode(Integer.parseInt(Character.toString(string_answer.charAt(0))));
	ListNode iterableNode = answerNode;
	for(int i = 1; i < string_answer.length(); i++){
	    iterableNode.next = new ListNode(Integer.parseInt(Character.toString(string_answer.charAt(i))));
	    iterableNode = iterableNode.next;
	}

	// Finished!
	return answerNode;
    }


    // A reverse method for strings that allows for ignoring the StringBuilder class
    public String revStr(String x){
	String reversed = "";
	for(int i = 1; i <= x.length(); i++){
	    reversed = reversed + x.charAt(x.length()-i);
	}
	return reversed;
    }
    

}

import java.math.BigInteger;
import java.util.Stack;
import java.text.DecimalFormat;

public class Q2{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
	// Variables and data structures
	String str_list_1 = "";
	String str_list_2 = "";
	DecimalFormat removeDecimal = new DecimalFormat("#");
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	ListNode temp, finalAnswer;

	// Push ListNode details to stack
	while(l1 != null){
	    s1.push(l1.val);
	    l1 = l1.next;
	}
	while(l2 != null){
	    s2.push(l2.val);
	    l2 = l2.next;
	}

	// Now unwind the stacks and build strings to be able to interpret the number
	while(!s1.empty()){
	    str_list_1 = str_list_1 + s1.pop();
	}
	BigInteger int1 = new BigInteger(str_list_1);
	while(!s2.empty()){
	    str_list_2 = str_list_2 + s2.pop();
	}
	BigInteger int2 = new BigInteger(str_list_2);

	
	String answer = (int1.add(int2)).toString();
        
	// Now that the List nodes have been unpacked the addition and converting back to ListNode occurs
	finalAnswer = new ListNode(Integer.parseInt(String.valueOf(answer.charAt(answer.length()-1))));
	temp = finalAnswer;

	for(int i = 2; i <= answer.length(); i++){
	    temp.next = new ListNode(Integer.parseInt(String.valueOf(answer.charAt(answer.length()-i))));
	    temp = temp.next;
	}

	// Return a list node
	return finalAnswer;

    }


}

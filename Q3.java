import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class Q3{

    public int lengthOfLongestSubstring(String s){
	System.out.println("The value of the string is: " + s);
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	ArrayList<Character> list = new ArrayList<Character>();
	int count = 0;
	
	for(int i = 0; i < s.length(); i++){
	    if(list.contains(s.charAt(i))){
	        pq.add(count);
		list.clear();
		count = 0;
	    }else{
		list.add(s.charAt(i));
		count++;
	    }
	    
	}

	// Return the result handling the case when all characters are unique
	if (pq.peek() != null){
	    return pq.peek();
	}else{
	    return s.length();
	}
	
    }
}

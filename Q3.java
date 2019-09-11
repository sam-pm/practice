import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;

public class Q3{

    public int lengthOfLongestSubstring(String s){
	// System.out.println("The value of the string is: " + s);
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	ArrayList<ArrayList> subStringList = new ArrayList<ArrayList>();
	pq.add(0);
	

	for(char c : s.toCharArray()){
	    ArrayList<Character> newList = new ArrayList<Character>();
	    subStringList.add(newList);
	}

	Iterator<ArrayList> ial = subStringList.iterator();
	int i = 0;
	// System.out.println("The length of subStringList is: " + subStringList.size());
	while(ial.hasNext()){
	    ArrayList cl = ial.next();
	    for (int j = i; j < s.length(); j++){
		if(cl.contains(s.charAt(j))){
		    pq.add(cl.size());
		    break;
		}else{
		    cl.add(s.charAt(j));
		    pq.add(cl.size());
		}
	    }
	    i++;
	}

	return pq.peek();
    }
}

import java.util.PriorityQueue;

public class Q5{
    public String longestPalindrome(String s){
	// Data sturctures and variables.
	PriorityQueue<String> pq = new PriorityQueue<String>();
	String subStr;
	
	for(int i = 0; i < s.length(); i++){
	    subStr = "";
	    for(int j = i; j > i; j++){
		// inner stub
		if(s.charAt(j) == s.charAt(s.length()-j)){
		    subStr = subStr + s.charAt(j);
		}else{
		    pq.push(subStr);
		    break;
		}
	    }
	    // outter stub
	}
	
	return pq.peek();
    }
}
/*

This is an incomplete solution that was headed towards a O(n^3) run time

*/

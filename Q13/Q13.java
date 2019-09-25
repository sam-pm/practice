import java.util.Hashtable;

public class Q13{
    public int romanToInt(String s){
	// Hashtable build
	Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
	ht.put('I', 1);
	ht.put('V', 5);
	ht.put('X', 10);
	ht.put('L', 50);
	ht.put('C', 100);
	ht.put('D', 500);
	ht.put('M', 1000);

	for(int i = 0; i < s.length(); i++){
	    if(!ht.containsKey(s.charAt(i))){
		return 0;
	    }
	}

	
	int value = 0;
	boolean check1, check2;
	check1 = check2 = false;
	// Iterate through chars
	for(int i = 0; i < s.length(); i++){
	    
	    // Need to handle when subtraction is necessary
	    check1 = (i+1) < s.length();
	    if(check1) check2 = ht.get(s.charAt(i)) < ht.get(s.charAt(i+1));
	    if(check1 && check2){
		// System.out.println("Subtraction");
		value = value - ht.get(s.charAt(i));
	    }else{
		// System.out.println("Addition");
		value = value + ht.get(s.charAt(i));
	    }
	}

	return value;
    }
}

/*
Runtime: 7 ms, faster than 35.56% of Java online submissions for Roman to Integer.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Roman to Integer.
*/


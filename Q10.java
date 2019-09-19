import java.util.ArrayList;

public class Q10{

    public boolean isMatch(String s, String p){
	// System.out.println("The value of string s is: " + s);
	// System.out.println("The value of string p is: " + p);
	
	boolean match, charSet;
	match = charSet = false;
	PatternNode currentPNode;
	ArrayList<PatternNode> PN_list = new ArrayList<PatternNode>();
	// * = 42
	// . = 46
	
	// Interpret the pattern defined by p
	for(int i = 0; i < p.length(); i++){
	    int char_val = p.charAt(i);
	    boolean final_loop = i+1 == p.length();
	    
	    // This checks for a valid char
	    if(char_val != 42 && !charSet){
		charSet = true;
	    }else if(char_val == 42){ // Skip the * character as it should already be counted.
		continue;
	    }

		
	    // Now build the pattern for the char
	    if(charSet && p.charAt(i+1) == 42){
		currentPNode = new PatternNode(p.charAt(i), Integer.MAX_VALUE);
	    }else{
		currentPNode = new PatternNode(p.charAt(i), 1);
	    }
	    
	    charSet = false;
	    PN_list.add(currentPNode);
	}

	
	// See if s follows pattern set by p
	for(int i = 0; i < PN_list.size(); i++){
	    char c = PN_list.get(i).getChar();
	    int patternRule = PN_list.get(i).getOccurance();
	    System.out.println("The char is: " + c + " with " + patternRule + " occurences");
	}

	
	return match;
    }
}



class PatternNode{
    // Variables
    protected PatternNode next;
    protected int occurence;
    protected char c;
    
    //constructor
    public PatternNode(char c, int occurence){
	this.c = c;
	this.occurence = occurence;
	next = null;
    }
    //functions
    public int getOccurance(){
	return this.occurence;
    }
    public char getChar(){
	return this.c;
    }
    public PatternNode getNext(){
	return next;
    }
}

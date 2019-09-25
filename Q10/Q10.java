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
	    
	    // This checks for a valid char
	    if(char_val != 42 && i+1 == p.length()){
		currentPNode = new PatternNode(p.charAt(i), 1);
		PN_list.add(currentPNode);
	    }else if(char_val == 42 && charSet){ // Skip the * character as it should already be counted.
		currentPNode = new PatternNode(p.charAt(i-1), Integer.MAX_VALUE);
		charSet = false;
		PN_list.add(currentPNode);
	    }else if(char_val !=42 && !charSet){
		charSet = true;
	    }else{
		currentPNode = new PatternNode(p.charAt(i-1), 1);
		PN_list.add(currentPNode);
	    }
	    
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

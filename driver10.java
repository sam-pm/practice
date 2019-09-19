public class driver10{

    public static void main(String args[]){
	Q10 s = new Q10();
	byte t1, t2, t3;
	t1 = t2 = t3 = 0;

	// Positive truth tests
	System.out.println("Truth test suite");
	if(s.isMatch("aaa", "a*")) t1++; // True
	if(s.isMatch("bbb", "bb*")) t1++; // True
	if(s.isMatch("ccc", "c..")) t1++; // True
	if(s.isMatch("", "")) t1++; // True
	System.out.println("Passed " + t1 + "/3 positive tests");

	// Negative truth tests
	System.out.println("False test suite");
	if(!s.isMatch("aba", "a*")) t2++; // False
	if(!s.isMatch("bbc", "b*")) t2++; // False
	if(!s.isMatch("ccc", "bbb")) t2++; // False
	System.out.println("Passed " + t2 + "/3 negative tests");


	// Invalid entry test suite
	
    }
}

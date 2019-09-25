import java.util.Arrays;

public class driver14{
    public static void main(String[] args){
	// Variables and objects
	Q14 s = new Q14();
	int tr = 0;
	String[] s1 = {"terst", "terrior", "terrific"}; // matches "ter"
	String[] s2 = {"no", "matching", "words"}; // no matches
	String[] s3 = {"what"}; // only one entry
	String[] s4 = {"boom", "boom", "boom"};
	String[] s5 = {};

	// Tests    
	if(s.longestCommonPrefix(s1).compareTo("ter") == 0) tr++;
	if(s.longestCommonPrefix(s2).compareTo("") == 0) tr++;
	if(s.longestCommonPrefix(s3).compareTo("what") == 0) tr++;
	if(s.longestCommonPrefix(s4).compareTo("boom") == 0) tr++;
	if(s.longestCommonPrefix(s5).compareTo("") == 0) tr++;


	// Test results
	System.out.println("Test Results:");
	System.out.println("Test 1: String array = " + Arrays.toString(s1) + " | expected result: \"ter\" | actual result: \"" + s.longestCommonPrefix(s1) + "\"");
	System.out.println("Test 2: String array = " + Arrays.toString(s2) + " | expected result: \"\" | actual result: \"" + s.longestCommonPrefix(s2) + "\"");
	System.out.println("Test 3: String array = " + Arrays.toString(s3) + " | expected result: \"what\" | actual result: \"" + s.longestCommonPrefix(s3) + "\"");
	System.out.println("Test 4: String array = " + Arrays.toString(s4) + " | expected result: \"boom\" | actual result: \"" + s.longestCommonPrefix(s4) + "\"");
	System.out.println("Test 5: String array = " + Arrays.toString(s5) + " | expected result: \"\" | actual result: \"" + s.longestCommonPrefix(s5) + "\"");
	System.out.println("Test cases passed: " + tr + "/5");
	
    }
}

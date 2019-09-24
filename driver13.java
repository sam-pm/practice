public class driver13{
    
    public static void main(String args[]){
	// Build object
	Q13 s = new Q13();

	// Valid Tests
	System.out.println("Valid Testing");
	System.out.println(s.romanToInt("VI") == 6);
	System.out.println(s.romanToInt("VII") == 7);
	System.out.println(s.romanToInt("IV") == 4);
	System.out.println(s.romanToInt("LVIII") == 58);
	System.out.println(s.romanToInt("MMMIM") == 3999);

	// Invalid Test
	System.out.println("\nInvalid Testing");
	System.out.println(s.romanToInt("VCR") == 0);
	System.out.println(s.romanToInt("vi") == 0);
	System.out.println(s.romanToInt("Vi") == 0);
	 
    }
}

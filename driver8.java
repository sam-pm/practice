public class driver8{
    public static void main(String args[]){
	Q8 s = new Q8();

	System.out.println(s.myAtoi("test")); // Return 0
	System.out.println(s.myAtoi("123")); // Return 123
	System.out.println(s.myAtoi("   321")); // Return 321
	System.out.println(s.myAtoi("806coach")); // Return 806
	System.out.println(s.myAtoi("-406")); // return 406

	System.out.println(s.myAtoi("  2147483647"));
	System.out.println(s.myAtoi("  -2147483648"));
	
    }
}

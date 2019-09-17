public class Q7{

    public int reverse(int x){
	int reversed = 0;
        
	while (x != 0){
	    // First pop using a modulo and int division to trim
	    int pop = x % 10;
	    x /= 10;

	    // Checks for out of bounds
	    if (reversed >= Integer.MAX_VALUE/10 || reversed <= Integer.MIN_VALUE/10) return 0;

	    // Then the pop integer needs to be added to reversed
	    reversed = reversed * 10 + pop;
	}

	return reversed;
    }

}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
Memory Usage: 33.5 MB, less than 11.66% of Java online submissions for Reverse Integer.
*/


public class Q9{

    public boolean isPalindrome(int x){
	if (x < 0) return false;
	if (x == 0) return true;

	int rev = 0;
	int temp = x;
	while(temp != 0){
	    //lets use the modulo operator
	    int pop = temp % 10;
	    temp /= 10;

	    rev = rev * 10 + pop;
	}

	return x == rev;
    }
}

/*
Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
Memory Usage: 35.7 MB, less than 5.58% of Java online submissions for Palindrome Number.
*/


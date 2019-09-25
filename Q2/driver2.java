public class driver2{

    public static void main(String[] args){
	Q3 s = new Q3();
	int total = s.lengthOfLongestSubstring(getAlphaNumericString(5));
        System.out.println(total);
	System.out.println(s.lengthOfLongestSubstring(""));
	System.out.println(s.lengthOfLongestSubstring("dvdf"));
	System.out.println(s.lengthOfLongestSubstring("ab"));
	System.out.println(s.lengthOfLongestSubstring("aab"));
	System.out.println(s.lengthOfLongestSubstring("aaaab"));
	System.out.println(s.lengthOfLongestSubstring("aaaaaaaab"));
	
    }

    public static String getAlphaNumericString(int n) { 
  
        // chose a Character random from this String 
        String AlphaNumericString = // "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	    // + "0123456789"
	    // "abcdefghijklmnopqrstuvxyz";
	    "abcdef";
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
		      .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 

}

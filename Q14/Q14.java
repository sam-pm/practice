public class Q14{
    public String longestCommonPrefix(String[] strs){
	// variables needed
	String longest = strs.length > 0 ? strs[0] : "";

	for(int i = 0; i < strs.length; i++){
	    // Scope variables
	    String curStr = "";
	    int sm_str = strs[i].length() > longest.length() ? longest.length() : strs[i].length();

	    for(int j = 0; j < sm_str; j++){
		if(longest.charAt(j) == strs[i].charAt(j)){
		    curStr = curStr + strs[i].charAt(j);
		}else {
		    break;
		}
	    }
	    longest = curStr;
	}

	return longest;
    }
}

/*
Runtime: 6 ms, faster than 6.66% of Java online submissions for Longest Common Prefix.
Memory Usage: 36.7 MB, less than 99.42% of Java online submissions for Longest Common Prefix.
*/


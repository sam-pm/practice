public class Q8 {
    public int myAtoi(String str){

	String str_parse = "";
	boolean negative, started;
        negative = started = false;

	// Iterate through the string and look for numbers, spaces and negative signs
	for(int i = 0; i < str.length(); i++){
	    int char_val = str.charAt(i);
	    System.out.println("The char is: "+ str.charAt(i)  + " with ASCII value: " + char_val);
	    if(char_val == 32 && !started){
		continue;
	    }else if(char_val == 45 && !started){ // Negative check
		negative = started = true;
            }else if(char_val == 43 && !started){ // positive check
                started =  true;
	    }else if (char_val < 48 || char_val > 57){
		break;
	    }else{
		str_parse = str_parse + str.charAt(i);
                started = true;
	    }

	}

        
	// Return the value with correct sign
	if (str_parse.length() > 0 && negative){ // Return negative 
	    double check = Double.parseDouble(str_parse);
	    if (check >= 2147483648.0){
		return Integer.MIN_VALUE;
	    }else{
		return (-1 * Integer.parseInt(str_parse));
	    }
	}else if(str_parse.length () > 0){ // Return positive
	    double check = Double.parseDouble(str_parse);
	    if (check >= Integer.MAX_VALUE){
		return Integer.MAX_VALUE;
	    }else{                          // return the correct value
		return (Integer.parseInt(str_parse));
	    }
	}else{
	    return 0;
	}
	
    }
}

/*
Runtime: 42 ms, faster than 5.22% of Java online submissions for String to Integer (atoi).
Memory Usage: 37.2 MB, less than 42.86% of Java online submissions for String to Integer (atoi).
*/


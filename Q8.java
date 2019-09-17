public class Q8 {
    public int myAtoi(String str){

	String str_parse = "";
	boolean negative = false;

	// Iterate through the string and look for numbers, spaces and negative signs
	for(int i = 0; i < str.length(); i++){
	    int value = str.charAt(i);
	    // System.out.println("The char is: "+ str.charAt(i)  + " with ASCII value: " + value);
	    if(value == 32){
		continue;
	    }else if(value == 45){
	        negative = true;
		continue;
	    }else if (value < 48 || value > 57){
		break;
	    }else{
		str_parse = str_parse + str.charAt(i);
	    }
	}

	// Return the value with correct sign
	if (str_parse.length() > 0 && negative){
	    double check = Double.parseDouble(str_parse);
	    if (check >= Integer.MAX_VALUE || check <= Integer.MIN_VALUE){
		return 0;
	    }else{
	       return (-1 * Integer.parseInt(str_parse));
	    }
	}else if(str_parse.length () > 0){
	    double check = Double.parseDouble(str_parse);
	    if (check >= Integer.MAX_VALUE || check <= Integer.MIN_VALUE){
		return 0;
	    }else{
	       return (Integer.parseInt(str_parse));
	    }
	}else{
	    return 0;
	}
	
    }
}

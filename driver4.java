import java.lang.Math;
import java.util.Random;

public class driver4{
    //main method
    public static void main(String args[]){
	// Create the object
	Q4 s = new Q4();
	Random r = new Random();
	int[] l1 = new int[r.nextInt(4)];
	int[] l2 = new int[r.nextInt(4)];

	// Fill the list
	for(int i = 0; i < l1.length; i++){
	    l1[i] = r.nextInt(10);
	}
	for(int i = 0; i < l2.length; i++){
	    l2[i] = r.nextInt(10);
	}

	// Call method
	double answer = s.findMedianSortedArrays(l1,l2);
	System.out.println(answer);
    }

}

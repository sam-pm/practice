import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q4{

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
	// System.out.println("List 1 = " + Arrays.toString(nums1) + " w/ length = " + nums1.length);
	// System.out.println("List 2 = " + Arrays.toString(nums2) + " w/ length = " + nums2.length);

	ArrayList<Integer> combined = new ArrayList<Integer>();
	for(int i = 0; i < nums1.length; i++){
	    combined.add(nums1[i]);
	}
	for(int i = 0; i < nums2.length; i++){
	    combined.add(nums2[i]);
	}
	Collections.sort(combined);
	// System.out.println("Combined = " + combined + " w/ length = " + combined.size());
	
	// Find median
	double answer;
	if(combined.size() % 2 == 0){
	    int middle = combined.size()/2;
	    answer = ((double) combined.get(middle) + (double) (combined.get(middle - 1)))/2 ;
	}else{
	    answer = combined.get((int) Math.floor(combined.size()/2));
	}

	return answer;
    }
}
/*
Runtime: 9 ms, faster than 11.03% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 47 MB, less than 87.50% of Java online submissions for Median of Two Sorted Arrays.
*/


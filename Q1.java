import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1{

    public int[] twoSum(int[] nums, int target){

      // Data structures needed for solution
      HashMap<Integer, Integer> map = new HashMap<>();
      int[] solution = new int[2];

      //Code to figure out what the solution is.
      for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
          solution[0] = map.get(nums[i]);
          solution[1] = i;
        }else{
          map.put(target-nums[i],i);
        }
      }

      return solution;
    }
}

/*
Runtime: 2 ms, faster than 98.83% of Java online submissions for Two Sum.
Memory Usage: 37.8 MB, less than 98.29% of Java online submissions for Two Sum.
*/

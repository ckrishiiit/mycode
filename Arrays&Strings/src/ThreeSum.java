import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given array nums = [-1, 0, 1, 2, -1, -4],
//[
//[-1, 0, 1],
//[-1, -1, 2]
//]

public class ThreeSum {

   public static List<List<Integer>> threeSum(int[] nums) {
        
	   List<List<Integer>> result = new ArrayList<>();
	   
	   if(nums == null || nums.length == 0)
		   return result;
	   
	   if(nums.length <3)
		   return null;
	   	   
	   Arrays.sort(nums);
	   
	   
	   
	   for(int i=0; i<nums.length; i++) {
		   
	    if( i>0 && nums[i] == nums[i-1])
	    	continue;
		   
		   int j= i+1;
		   int k = nums.length-1;
		   
		   while( j< k) {
			   
			   if(nums[j] + nums[k] + nums[i] == 0) {
				
				   List<Integer> list = new ArrayList<>();
				   list.add(nums[i]);list.add(nums[j]);list.add(nums[k]);
				   k--;
				   j++;
				   result.add(list);
			   }
			   else if(nums[j] + nums[k] > nums[i])
				   k--;
			   else if(nums[j] + nums[k] < nums[i])
				   j++;
		   }
	   }
	   return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,-1,-1,0};
		List<List<Integer>> res = threeSum(nums);
		for (List<Integer> list : res) {
			for (Integer no : list) {
				System.out.print(no+",");
			}
			System.out.println();
		}
	}

}

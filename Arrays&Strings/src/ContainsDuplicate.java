import java.util.HashSet;

public class ContainsDuplicate {
	
	 public static boolean containsDuplicate(int[] nums) {
		  
		 if(nums == null || nums.length ==0)
			 return false;
		 
		 HashSet<Integer> set = new HashSet<>();
		 
		 for(int i=0; i<nums.length; i++) {
			 if(set.contains(nums[i]))
				  return true;
			 else
				 set.add(nums[i]);
		 }
		 
		 return false;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,5,5};
		System.out.println(containsDuplicate(nums));

	}

}

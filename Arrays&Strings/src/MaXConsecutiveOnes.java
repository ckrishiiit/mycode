
public class MaXConsecutiveOnes {

	 public static int findMaxConsecutiveOnes(int[] nums) {
		 
		 int prevCount = 0, currentCount = 0;
		 
		 if(nums == null)
			 return 0;
		 for(int i=0; i<nums.length; i++) {
			 if(nums[i] == 1)
				 currentCount++;
			 else {
				 if(currentCount > prevCount)
					 prevCount = currentCount;
				 currentCount = 0;
			 }
		 }
		 
		 if(prevCount == 0 || currentCount > prevCount)
			 return currentCount;
		 
		 return prevCount;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,1,1,1,0,1,1,1,1,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}
	
}

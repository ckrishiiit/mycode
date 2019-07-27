import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {

	   public static int[] intersection(int[] nums1, int[] nums2) {
	        
	    	
	    	if(nums1 == null || nums2==null)
	    		return null;
	    	
	    	Set<Integer> set = new HashSet<>();
	    	
	    	int[] no1 = (nums1.length < nums2.length) ? nums1 : nums2;
	    	int[] no2 = (nums1.length < nums2.length) ? nums2 : nums1;
	    	
	        // Adding to set
	    	for(int i=0; i<no1.length; i++)
	    		set.add(no1[i]);
	    	
	    	int[] res = null;
	    
	    	// Add to list which are common in both arrays
	    	List<Integer> list = new ArrayList<>();
	    	for(int i=0; i<no2.length; i++) {
	    		if(set.contains(no2[i]) && !list.contains(no2[i]))
	    			list.add(no2[i]);	
	    	}
	    	
	    	res = new int[list.size()];
	    	int k = 0;
	    	for (Integer item : list) {
				res[k++] = item;
			}
	    	
	    	return res;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] res = intersection(nums1, nums2);
		
		for (int i : res) {
			System.out.print(i +" ");
		}
	}

}

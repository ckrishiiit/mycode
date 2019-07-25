import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		
	     
			if(strs == null)
				return null;
			
			
		List<List<String>> res = new ArrayList<>();
		
		 int primes[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
				 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
		 
		 Map<Integer, List<String>> map = new HashMap<>();
		 
		 for(int i=0; i<strs.length; i++) {
			 
			 String str = strs[i];
			 int val = 1;
			 for(int j=0; j<str.length(); j++) {
				 
				 val = val*primes[str.charAt(j) - 'a'];
			 }
				 if(!map.containsKey(val)) {
					 
					 List<String> list =  new ArrayList<>();
					 list.add(str);
					 map.put(val, list);
					 
				 }else {
					 map.get(val).add(str);
				 }
			 
		 }
		 
	    for (Integer val : map.keySet()) {
			res.add(map.get(val));
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = groupAnagrams(str);
		for (List<String> list : res) {
			for (String word : list) {
				System.out.println(word);
			}
			System.out.println();
		}

	}

}

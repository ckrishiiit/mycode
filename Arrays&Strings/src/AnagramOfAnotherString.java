import java.util.HashMap;
import java.util.Map;

public class AnagramOfAnotherString {

	public static boolean isAnagram(String s1, String s2) {
		
		if(s1 == null || s2 == null)
			return false;
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}else
				map.put(ch, map.get(ch)+1);
		}
	
		for(int i=0; i<s1.length() -s2.length(); i++) {
			
			int end = s2.length() + i;
			String subStr = s1.substring(i, end);
			if(isAnagram(subStr,map)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	private static boolean isAnagram(String s, Map<Character, Integer> map) {
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)-1);
			else
				return false;
		}
		
		for(Character ch: map.keySet()) {
			if(map.get(ch) != 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Heo krishna how are you.";
		String s2 = "shnariks";
	
		System.out.println(isAnagram(s1, s2));
	}

}

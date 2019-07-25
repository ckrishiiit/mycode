import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * Input: "abcabcbb"
   Output: 3 
   Explanation: The answer is "abc", with the length of 3. 
 * @author krish
 *
 */
public class LongestSubstring {

	public static int lengthOfLongestSubstring(String str) {
		
		/*Map<Character, Integer> map = new HashMap<>();
		
		int maxL = 0, begin = 0;
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch) && map.get(ch) >= begin)
				 begin = map.get(ch) + 1;
		
			  map.put(ch, i);
			  maxL = Math.max(maxL,i - begin + 1);
		}
		
		return maxL;*/
		
		boolean[] hasChar = new boolean[256];
		
		int l = 0, r = 0, maxL=0;
		
		while( l<str.length() && r<str.length()) { 
			char ch = str.charAt(r);
			if(hasChar[ch] == true) {
				hasChar[ch] = false;
				l++;
			}else {
				hasChar[ch] = true;
				r++;
			}
			maxL = Math.max(maxL,  r-l);
		}
		
	    return maxL;
	}
	
	public static void main(String args[]) {
		
		System.out.println(lengthOfLongestSubstring("aaanananndkdijklm"));
	}
}

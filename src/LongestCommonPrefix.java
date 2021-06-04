/**
 * @author Hansen Li
 *
 * @date Jun 3, 2021
*/

/*
 * Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters. 
 * 
 * ["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
 */

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] test = {"this", "thiss", "thi", "thia"};
		
		System.out.println(PrefixScan(test));
	}
	
	public static String PrefixScan(String[] st) {
		
		String result = st[0];
		// same = true;
		
		//StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < st.length; i++) {
			result = StringCompare(result, st[i]);
			
		}
		
		
		return result;
		
	}
	
	public static String StringCompare(String s1, String s2) {
		String result = "";
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		for (int i = 0, j = 0; i <= l1 - 1 && j <= l2 - 1; i++, j++) {
			if (s1.charAt(i) != s2.charAt(j) ) {
					break;
			}
			result += s1.charAt(i);
			
		}
		
		return result;
		
	}
	
}

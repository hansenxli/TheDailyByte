/**
 * @author Hansen Li
 *
 * @date May 29, 2021
*/

/*“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
*/

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		sc.close();
		
		List<Character> chars = new ArrayList<>();
		
		for (char ch: input.toCharArray()) {
			chars.add(ch);
		}
		
		//System.out.println("passed char add");
		
		StringBuilder sb = new StringBuilder();
		//System.out.println(chars);
		
		for (int i = chars.size() - 1; i >= 0; i--) {
			
			//System.out.println(i);
			sb.append(chars.get(i));
			
		}
		
		//System.out.println("out");
		
		String output = sb.toString();
		
		System.out.println(output);
		
	}
}

/**
 * @author Hansen Li
 *
 * @date May 30, 2021
*/

/*Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters. */
/*"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true*/

import java.util.*;

public class ValidPalindrome {

	public static void main(String[] args) {

		System.out.println("Please enter palindrome to test:");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		
		boolean result = ValidCheck(input);
		
		sc.close();
		
		if (result)
			System.out.println("True");
		else
			System.out.println("False");

	}

	public static boolean ValidCheck(String st) {

		List<Character> chars = new ArrayList<>();

		for (char ch : st.toCharArray())
			chars.add(ch);

		// System.out.println(chars);

		for (int i = 0; i < chars.size(); i++) {
			if (chars.get(i) == chars.get(chars.size() - 1 - i)) {
				continue;
			} else {
				return false;
			}

		}

		return true;

	}

}

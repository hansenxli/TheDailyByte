
/**
 * @author Hansen Li
 *
 * @date Jun 1, 2021
/*
 * Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.
 * "USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 * */
import java.util.*;

public class CorrectCapitalization {

	public static void main(String[] args) {

		System.out.println("Please enter string: ");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		sc.close();

		if (CheckStringCase(input))
			System.out.println("True");
		else
			System.out.println("False");
	}

	public static boolean CheckStringCase(String st) {
		boolean firstCap;
		boolean secondCap;

		if (Character.isUpperCase(st.charAt(0))) {
			firstCap = true;
		} else {
			firstCap = false;
		}

		// case if first letter is upper case
		if (firstCap) {

			// checks second character
			if (Character.isUpperCase(st.charAt(1)))
				secondCap = true;
			else
				secondCap = false;

			// if second is cap
			if (secondCap) {
				for (int j = 2; j < st.length(); j++) {
					// if lowercase found
					if (!Character.isUpperCase(st.charAt(j))) {
						return false;
					}
				}

			}
			// second lower case
			else {
				for (int j = 2; j < st.length(); j++) {
					// upper case found
					if (Character.isUpperCase(st.charAt(j))) {
						return false;
					}
				}
			}

		}

		// case if first letter is lower case
		// checks if all letters are lower case
		// returns false if uppercase found in middle of word
		else {
			for (int i = 1; i < st.length(); i++) {
				if (Character.isUpperCase(st.charAt(i)))
					return false;
			}
		}

		return true;

	}

}

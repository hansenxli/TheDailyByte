/**
 * @author Hansen Li
 *
 * @date Jun 2, 2021
*/
/*
 * Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0 

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
 */

import java.util.*;

public class AddBinary {

	public static void main(String[] args) {

		System.out.println("Input first binary string: ");
		Scanner sc = new Scanner(System.in);
		String binary1 = sc.nextLine();
		System.out.println("Input second binary string: ");
		String binary2 = sc.nextLine();

		System.out.println(addBinary(binary1, binary2));
	}

	public static String addBinary(String b1, String b2) {
		String result = "";
		int sum = 0;

		int b1Length = b1.length() - 1;
		int b2Length = b2.length() - 1;

		while (b1Length >= 0 || b2Length >= 0 || sum == 1) {

			
			sum += ((b1Length >= 0) ? b1.charAt(b1Length) - '0' : 0);
			sum += ((b2Length >= 0) ? b2.charAt(b2Length) - '0' : 0);

			result = (char) (sum % 2 + '0') + result;

			sum /= 2;

			b1Length--;
			b2Length--;

		}

		return result;
	}
}

/**
 * @author Hansen Li
 *
 * @date May 31, 2021
*/

/*Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.
 * "LR", return true
"URURD", return false
"RUULLDRD", return true
 */

import java.util.*;

public class VacuumCleanerRoute {

	public static void main(String[] args) {
		
		System.out.println("Input vacuum path string: ");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().toLowerCase();
		
		sc.close();
		
		boolean status = RouteCheck(input);
		
		if (status)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	
	public static boolean RouteCheck(String st) {
				
		int vertical = 0;
		int horizontal = 0;
		
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'u')
				vertical++;
			else if (st.charAt(i) == 'd')
				vertical--;
			else if (st.charAt(i) == 'r')
				horizontal++;
			else if (st.charAt(i) == 'l')
				horizontal--;
			else;
			
		}
		
		if (vertical == 0 && horizontal == 0)
			return true;
		else
			return false;
		
	}
}

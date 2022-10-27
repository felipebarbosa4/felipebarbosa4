package SwitchDemo;/*
 * Author: Stanley Pieda
 * Date: Oct 31, 2020
 * Description: Demonstration of switch with constants
 */
import java.util.Scanner;

/*
 * This class runs a simple demonstration of switch statement
 */
public class RunDemo {

	/*
	 * Entry point for the application.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int UPPER = 1;
		final int LOWER = 2;
		final int ORIGINAL = 3;
		String word = null;
		int option = 0;

		System.out.println("Enter a word");
		word = keyboard.nextLine();

		System.out.println("Select: ");
		System.out.println(UPPER + " for upper case");
		System.out.println(LOWER + " for lower case");
		System.out.println(ORIGINAL + " for original case");
		option = keyboard.nextInt();

		// try removing one or more break; statements and re-run program.
		switch(option) {
		case UPPER:
			System.out.println(word.toUpperCase());
			break;
		case LOWER:
			System.out.println(word.toLowerCase());
			break;
		case ORIGINAL:
			System.out.println(word);
			break;
		default:
			System.out.println("Invalid option entered");
			break;
		}
	}
}

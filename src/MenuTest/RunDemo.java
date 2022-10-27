package MenuTest;/*
 * Author: Stanley Pieda
 * Date: March 3, 2022
 * Copyright(C): Algonquin College
 */
import java.util.Scanner;

/*
 * Demonstrates a simple menu system.
 */
public class RunDemo {

	/*
	 * Entry point, and core logic for the application.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Person person = new Person();
		String value; // used for String input and output
		int option; // user menu selection
		
		// avoid magic numbers
		final int DISPLAY_FIRST_NAME = 1;
		final int DISPLAY_LAST_NAME = 2;
		final int DISPLAY_PHONE = 3;
		final int DISPLAY_ALL = 4;
		
		System.out.printf("Enter first name: ");
		value = keyboard.nextLine();
		person.setFirstName(value);
		
		System.out.printf("Enter last name: ");
		value = keyboard.nextLine();
		person.setLastName(value);
		
		System.out.printf("Enter phone number: ");
		value = keyboard.nextLine();
		person.setPhoneNumber(value);
		
		System.out.printf("Select from the following menu:%n");
		System.out.printf("%d to show first name%n", DISPLAY_FIRST_NAME);
		System.out.printf("%d to show last name%n", DISPLAY_LAST_NAME);
		System.out.printf("%d to show phone number%n", DISPLAY_PHONE);
		System.out.printf("%d to show all%n", DISPLAY_ALL);
		option = keyboard.nextInt();
		keyboard.nextLine(); // clean up input stream
		
		switch(option) {
		case DISPLAY_FIRST_NAME:
			value = person.getFirstName();
			break;
		case DISPLAY_LAST_NAME:
			value = person.getLastName();
			break;
		case DISPLAY_PHONE:
			value = person.getPhoneNumber();
			break;
		case DISPLAY_ALL:
			value = person.toString();
			break;
		default:
			value = "Invalid menu option selected";
			break;
		}
		

		
		System.out.println(value);

	}

}
/*
 * Alternative Logic
		if (DISPLAY_FIRST_NAME == option) {
			value = person.getFirstName();
		}
		else if (DISPLAY_LAST_NAME == option) {
			value = person.getLastName();
		}
		else if (DISPLAY_PHONE == option) {
			value = person.getPhoneNumber();
		}
		else if (DISPLAY_ALL == option) {
			value = person.toString();
		}
		else {
			value = "Invalid menu option selected";
		}
 */

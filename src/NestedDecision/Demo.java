package NestedDecision;/*
import java.util.Scanner;

/*
 * Simply used to demonstrate nested if structure
 */

import java.util.Scanner;

public class Demo {

	private Scanner keyboard = new Scanner(System.in);

	/*
	 * This method demonstrates a direct translation from the 
	 * pseudocode, but is not the way typically a Java programmer
	 * would structure the statements. See second method below.
	 */
	public void demoNestedIfPseudocodeVersion() { 
		int grade = 0;

		System.out.println("Please enter grade");
		grade = keyboard.nextInt();

		if (grade >= 80) {
			System.out.println("A");
		}
		else {
			if (grade >= 70) {
				System.out.println("B");
			}
			else {
				if (grade >= 60) {
					System.out.println("C");
				}
				else {
					if (grade >= 60) {
						System.out.println("D");
					}
					else {
						System.out.println("F");
					}
				}
			}
		}
	}

	/*
	 * This method is the same decision structure, however it more closely
	 * follows Java coding conventions where else if is used to nest the if
	 * statements. Each else above only has one statement inside, typically
	 * an if-else structure. So the opening and closing braces { } were removed
	 * from each else, and the if statement is placed in-line with the elses.
	 * Hence "else if", caution, the last else below, only matches the second-
	 * last if.
	 */
	public void demoNestedIfJavaConventions() { 
		int grade = 0;

		System.out.println("Please enter grade");
		grade = keyboard.nextInt();

		if (grade >= 80) {
			System.out.println("A");
		}
		else if (grade >= 70) {
			System.out.println("B");
		}
		else if (grade >= 60) {
			System.out.println("C");
		}
		else if (grade >= 50) {			// "last if"
			System.out.println("D");
		}
		else { // this else belongs to the if labeled with "last if"
			System.out.println("F");
		}
	}
}

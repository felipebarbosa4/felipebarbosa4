package ToStringTests;/*
 * Author: Stanley Pieda
 * Date: March 2, 2022
 * Copyright(C): Algonquin College
 */

/*
 * This class has method main and provides a simple demonstration of calling
 * method toString.
 */
public class Program {
	/*
	 * Entry point of the application
	 */
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println(apple); // println will call toString() automatically
	}
}

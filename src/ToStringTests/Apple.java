package ToStringTests;/*
 * Author: Stanley Pieda
 * Date: March 2, 2022
 * Copyright(C): Algonquin College
 */

/*
 * This class represents an apple, with quantity.
 */
public class Apple {
    private int quantity;
    
    /*
     * no-argument constructor
     */
    public Apple() {
    	quantity = 0;
    }

    /*
     * accessor for quantity
     */
	public int getQuantity() {
		return quantity;
	}

	/*
	 * mutator for quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/*
	 * toString, returns a text representation of this apple object in form of:
	 * "Apple class with quantity of " + quantity + "."
	 */
	public String toString() {
		String report;
		report = "Apple class with quantity of " + quantity + ".";
		return report;
	}
    
}

/*
 * Program to add VAT to a price - version 2
 *
 * This version eliminates the extra price 'totalPrice' variable
 */

import java.util.Scanner;

class AddVat2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter the item price: ");
		double price = in.nextDouble();
		
		double vat = price * 0.2;
		System.out.println("The VAT is: " + vat);
		
		//Use the += operator to shorten the expression
		price += vat; //same as price = price + vat;
		System.out.println("You pay: " + price);
	}
}
/*
 * Program to add VAT to a price - version 1
 *
 * This is a simple version of the program - it's "OK" but we can improve it
 */

import java.util.Scanner;

class AddVat1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter the item price: ");
		double price = in.nextDouble();
		
		double vat = price * 0.2;
		System.out.println("The VAT is: " + vat);
		
		double totalPrice = price + vat;
		System.out.println("You pay: " + totalPrice);
	}
}
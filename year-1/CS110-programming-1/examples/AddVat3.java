/*
 * Program to add VAT to a price - version 3
 *
 * This version gets rid of the 'magic number' 0.2
 */

import java.util.Scanner;

class AddVat3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final double VAT_VALUE = 20.0;
	
		System.out.print("Enter the item price: ");
		double price = in.nextDouble();
		
		//calculate the VAT from the VAT_VALUE constant
		double vat = price * (VAT_VALUE/100);
		System.out.println("The VAT is: " + vat);
		
		price += vat;
		System.out.println("You pay: " + price);
	}
}
/*
 * Program to add VAT to a price - version 3
 *
 * One problem with the previous versions is that it can end up printing far too many decimal places.
 * For example, try entering 63 as the item price - you get a VAT value of 12.600000000000001
 *
 * We can use the printf ('print format') to control the output. It's a powerful method (you can
 * read more about it on page 50 of 'Java for Everyone' (2nd ed)). We are only going to use
 * one of it's capabilities - System.out.printf("%.2f",price) uses the *format string* %2.f to
 * specify that we will output a floating point number (the 'f' part) with two digits after
 * the . (the '.2' part). The '%' just marks the start of the format string.
 */

import java.util.Scanner;

class AddVat5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final double VAT_VALUE = 20.0;
	
		System.out.print("Enter the item price: ");
		double price = in.nextDouble();
		
		//calculate the VAT from the VAT_VALUE constant
		double vat = price * (VAT_VALUE/100);
		
		//Output the VAT with 2 decimal places - the \n prints a newline character
		System.out.printf("The VAT is: %.2f\n", vat);
		
		price += vat;
		System.out.printf("You pay: %.2f\n", price);
	}
}
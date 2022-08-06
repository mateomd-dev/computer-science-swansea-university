/*
 * This program aveages three numbers - but unless you replace the 3 with 3.0 it will
 * do *integer division* and - probably - output the wrong answer
 */

import java.util.Scanner;

class AverageOfThree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int firstNumber = in.nextInt();
		
		System.out.println("Enter the second number: ");
		int secondNumber = in.nextInt();
		
		System.out.println("Enter the third number: ");
		int thirdNumber = in.nextInt();
		
		//Because the numbers in the expression on the right of the =
		//are all integers, the result is an integer. To get a double
		//as the result (and probably the correct answer) replace 3 with 3.0
		double average = (firstNumber + secondNumber + thirdNumber) / 3;
		
		System.out.println("The average is: " + average);
	}
}
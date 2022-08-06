/* Program to create an empty array and 
   store factorials in it

   Factorial: n! = n * n-1 * n-2 *...*1

   Or n! = n * (n-1)!
 */

public class ArrayFactorial {
	public static void main(String[] args) {
		
		//Create an array with 8 spaces - we can
		//change 8 to any value we want
		int[] factorials = new int[8];
		
		//factorial of zero is one by definition
		factorials[0] = 1;
		
		//This loop calculates the factorials
		//Note using factorials.length means the
		//loop will automatically go around the right
		//number of times
		for(int i = 1; i < factorials.length; i++) {
			factorials[i] = i * factorials[i-1];
		}
		
		//This loop prints the array
		for(int i = 0; i < factorials.length; i++) {
			System.out.println(i + ": " + factorials[i]);
		}
	}
}
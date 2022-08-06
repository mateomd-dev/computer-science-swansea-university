import java.util.Scanner;

/* Program to remove an element from an array. Doesn't quite work!
We try to move the last element in the array into the space we want to delete but the problem is that this
just *copies* the last element of the array - and it's still there.
*/

class Remove {
	public static void main(String[] args) {
		double[] data = {1.5, 2.3, 4.7, 2.1, 1.0, 0.9};
		int deleteNumber;
		
		//Print out the starting contents
		System.out.println("Before:");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		/*Read in the index of the array element to delete -
		  notice the use or OR (||) in the do-while loop*/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter element no. to remove between 0 and " +
			(data.length - 1) + ": ");
		
		do{
			deleteNumber = in.nextInt();
		} while ((deleteNumber < 0) || (deleteNumber > data.length - 1));
			
		//Move the last element to overwrite the one we want to get rid of
		data[deleteNumber] = data[data.length -1 ];
		
		//Print out the final contents - notice last element still there
		System.out.println("After:");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
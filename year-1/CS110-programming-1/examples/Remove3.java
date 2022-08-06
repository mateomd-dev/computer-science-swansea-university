import java.util.Scanner;

/* This version of Remove maintains the order of the elements - suppose they are in sorted order for example.
(Do you begin to get the impression that this is all getting irritatingly complicated?)
*/

class Remove3 {
	public static void main(String[] args) {
		double[] data = {1.5, 2.3, 4.7, 5.2, 6.0, 7.9};

		int deleteNumber;
		
		//Print out the starting contents
		System.out.println("Before:");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		//Variable to keep track of the length of the array excluding the 
		//element we are going to "delete"
		int count = data.length;
		
		/*Read in the index of the array element to delete
		  notice the use or OR (||) in the do-while loop*/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter element no. to remove between 0 and " +
			(data.length - 1) + ": ");
		
		do{
			deleteNumber = in.nextInt();
		} while ((deleteNumber < 0) || (deleteNumber > data.length - 1));
			
		count--; //Mark the array as one element shorter because we've deleted an element
		
		//Copy the elements beyond the one we delete 'back' one place in the array
		for(int i = deleteNumber; i < count; i++){
			data[i] = data[i+1];
		}
		
		//Print out the final contents
		System.out.println("After:");
		for(int i = 0; i < count; i++){
			System.out.println(data[i]);

		}
	}
}
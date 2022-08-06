import java.util.Scanner;

/* This version of Remove fixes the problem of the last one - but we need to use an extra int variable to keep
track of how long the array "really" is - because data.length is no longer going to be accurate. Also, this
doesn't help if we need to keep the data in order.
*/

class Remove2 {
	public static void main(String[] args) {
		double[] data = {1.5, 2.3, 4.7, 2.1, 1.0, 0.9};
		int deleteNumber;
		
		//Print out the starting contents
		System.out.println("Before:");
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		//Variable to keep track of the length of the array excluding the element
		//we are going to "delete"
		int count = data.length;
		
		/*Read in the index of the array element to delete
		  notice the use or OR (||) in the do-while loop*/
		Scanner in = new Scanner(System.in);
		System.out.print("Enter element no. to remove between 0 and " +
			(data.length - 1) + ": ");
		
		do{
			deleteNumber = in.nextInt();
		} while ((deleteNumber < 0) || (deleteNumber > data.length - 1));
			
		//Move the last element to overwrite the one we want to get rid of
		data[deleteNumber] = data[count -1 ];
		count--; //This is where we mark the last element as "really" deleted
		
		//Print out the final contents
		//..but notice we can't now use for-each because the lenght of the array 
		// that Java understands is not what we want
		System.out.println("After:");
		for(int i = 0; i < count; i++){
			System.out.println(data[i]);

		}
	}
}
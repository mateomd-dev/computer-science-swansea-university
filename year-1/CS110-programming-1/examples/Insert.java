import java.util.Scanner;

/* This program inserts an element into an array
*/

class Insert{
	public static void main(String[] args) {
		int[] data = new int[10];
		int insertNumber;
		int value;	
		
		Scanner in = new Scanner(System.in);
		
		//Variable to keep track of the length of the array 
		int count = 0;
		
		//We're going to be a bit sloppy and deliberately use an infinite loop
        while(true){
	
			//Read in where we're going to insert
			System.out.print("Enter element no. to insert between 0 and " + count + ": ");
			
			do{
				insertNumber = in.nextInt();
			} while ((insertNumber < 0) || (insertNumber > count));
			
			//Read in the actual value to insert
			System.out.print("Enter value: ");
			value = in.nextInt();
				
		    //Increase our count of the size of the array
			count++; //Mark the array as one element shorter because we've
					  //deleted an element
			
			//Copy the elements beyond the one we insert 'forward' one place in the array
			//Notice we have to count from the back of the array forward to avoid
			//overwriting data
			//This is a *serious* nuisance - imagine if the array was really long
			for(int i = count; i > insertNumber; i--){
				data[i] = data[i-1];
			}
			//Actually insert the element
			data[insertNumber] = value;
			
			//Print out the contents
			System.out.println("Array:");
			for(int i = 0; i < count; i++){
				System.out.println(data[i]);

			}
		}
	}
}
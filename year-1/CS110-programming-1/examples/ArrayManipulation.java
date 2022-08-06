import java.util.Random;
/* Program showing how to print and manipulate
   array data
  */
public class ArrayManipulation {
	public static void main(String[] args) {
	
		//Array of pre-defined integer data
		int[] shapeSides = {3,4,5,6,7,8,10};
		
		//print out the array - use .length to 
		//automatically loop the right number of
		//times
		for(int i = 0; i < shapeSides.length; i++) {
			System.out.println(shapeSides[i]);
		}
		
		//add one to each array element
		for(int i = 0; i < shapeSides.length; i++) {
			shapeSides[i]++;
		}
		
		//print them again
		for(int i = 0; i < shapeSides.length; i++) {
			System.out.println(shapeSides[i]);
		}

	}
}
		
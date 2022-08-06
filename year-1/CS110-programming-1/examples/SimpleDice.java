import java.util.Scanner;

/**
   This program reads a sequence of die toss values and prints how many times
   each value occurred.
*/
public class SimpleDice
{

   
   
   public static void main(String[] args)
   {
	  
	  final int SIDES = 6;
      int[] counters = new int[SIDES]; // counters[0] is not used
      
      System.out.println("Please enter values, Q to quit:");
      Scanner in = new Scanner(System.in);
      
      //Read in the values
      while (in.hasNextInt()) {  
         int value = in.nextInt();

         // Increment the counter for the input value
         if (1 <= value && value <= SIDES) {
            counters[value - 1]++;
			//System.out.println("Count of " + value + " is " + counters[value]);
         } else {
            System.out.println(value + " is not a valid input.");
         }
      }
     
      // Print out the counts of the entered values
      for (int j = 0; j < counters.length; j++) {
         System.out.println((j + 1) + ": " + counters[j]);
      }
   }
}


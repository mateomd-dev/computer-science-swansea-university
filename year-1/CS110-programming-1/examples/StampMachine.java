import java.util.Scanner;

/**
   This program simulates a stamp machine that receives pound notes and dispenses 
   first class and 1p stamps.
*/
public class StampMachine
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      final int FIRST_CLASS_STAMP_PRICE = 46; // Price in pence

      System.out.print("Enter number of pounds: ");
      int pounds = in.nextInt();

      // Compute and print the number of stamps to dispense

      int firstClassStamps = 100 * pounds / FIRST_CLASS_STAMP_PRICE;
      int change = 100 * pounds - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
      System.out.printf("First class stamps: %6d\n", firstClassStamps);
      System.out.printf("1p stamps:       %6d\n", change);
   }
}

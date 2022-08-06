/*
 * Program to illustrate the concept of the visibility, or scope, of
 * a varialbe. Note that average is defined and only used inside the {..}
 * for the else statement. As an exercise, try using it outside the {..} by,
 * say, printing it. Work out how you can fix this problem.
 */

public class ScopeDemo {
	public static void main(String[] args) {
		int count = 5;	//number of items
		int total = 35; //sum of item values
		
		if (count == 0){
			System.out.println("Divide by zero");
		} else {
			int average = total / count;
			System.out.println("Average: " + average);
		}
	}
}
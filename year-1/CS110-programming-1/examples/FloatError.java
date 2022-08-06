/**
This program shows that when you use floating point numbers ('double') then
you cannot expect calculations to be performed exactly.
So rather than checking if a floating point number is *exactly* equal to
something, you should instead check that it's 'close enough'
*/

public class FloatError {
	public static void main(String[] args) {
	
		double r = Math.sqrt(2.0);
	
		//This is the wrong way to do it:-)
		if (r*r == 2.0) {
			System.out.println("root 2 squared is 2.0");
		} else {
			System.out.println("root 2 squared is not 2.0 but "+ r*r);
		}
		
		//And this is the right way
		final double EPSILON = 1E-14;//1 x 10-14
		
		if (Math.abs(r*r - 2.0)  < EPSILON) {
			System.out.println("root 2 squared is near enough 2.0");
		} 
		
		
	}
}	
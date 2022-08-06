import java.util.Random;

public class BetterShape {
	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		String[] shapeNames = {"Triangle", "Square",
								  "Pentagon",
								  "Hexagon", "Heptagon",
								  "Octagon", "Decagon"};
		int[] shapeSides = {3,4,5,6,7,8,10};
		
		int sides = rnd.nextInt(shapeNames.length);
		
		System.out.print("The shape of the day is a ");
		System.out.println(shapeNames[sides]);
		System.out.println("It has " + shapeSides[sides]
			+" sides");
	}
}
		
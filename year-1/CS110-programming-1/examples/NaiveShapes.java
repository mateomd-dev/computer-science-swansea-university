import java.util.Random;

public class NaiveShapes {
	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		final int MAXSHAPES = 6;
		final int TRIANGLE = 3;
		
		int sides = rnd.nextInt(MAXSHAPES)+TRIANGLE;
		
		System.out.println("Sides is " + sides);
		System.out.print("The shape of the day is a ");
		switch (sides) {
			case 3:
				System.out.println("Triangle.");
				break;
			case 4:
				System.out.println("Square.");
				break;
			case 5:
				System.out.println("Pentagon.");
				break;
			case 6:
				System.out.println("Hexagon.");
				break;
			case 7:
				System.out.println("Heptagon.");
				break;
			case 8:
				System.out.println("Octagon");
				break;
		}
	}
}
		
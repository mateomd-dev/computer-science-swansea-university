import java.util.Scanner;
import java.util.ArrayList;

/* Class to test Person
 */
class TestPerson {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/* Set up an array list to store person objects. The <Person> bit is to tell the
		 * Java compiler that this array list will *only* be used to store Person objects
		 * and nothing else. If you know that an array list (or other data storage structure)
		 * will only hold one type of object (and you nearly always do) it's good practice to
		 * tell the compiler using <..>. If you don't the compiler will warn you (and I'll
		 * deduct marks:-)
		 */
		ArrayList<Person> personList = new ArrayList<Person>();
		boolean again;
		
		do {
			System.out.print("Enter name: ");
			String name = in.next();
			
			System.out.print("Enter DOB: ");
			//Must be in format year-month-day
			String dob = in.next();
			
			//Once you've got the name and date of birth, create a Person object with them
			Person p = new Person(name, dob);
			System.out.println("Created object:" + name + " " + p.getName());
			//Now add it to the array list
			personList.add(p);
			
			//Print out some details, including the age (which we calculate)
			System.out.println("Name: " + p.getName() + " age: "+ p.getAge());
			
			//Now see if we want to enter another one
			String input;
			do {
				System.out.print("Another (n/y)? ");
				input = in.next();
			} while(!input.equalsIgnoreCase("n") && !input.equalsIgnoreCase("y"));
			again = input.equalsIgnoreCase("y");
		} while(again);
			
			
			
		
		/*EXERCISE: Add another loop to print out the contents of the array list (which is
		 * very simliar to something you will need to do in the coursework:-)
		 *
		 * You can either use an ordinary for loop (to access the i'th element of the
		 * array list p you will need to use p.get(i). Or you can use the enhanced (for each)
		 * loop - which would be better practice.
		 */
		for(int i = 0; i < personList.size(); i++){
			//Person currentPerson = personList.get(i);
			System.out.println(personList.get(i).getName());
			System.out.println(personList.get(i).getDob());
		}
		
		for(Person currentPerson : personList){
			System.out.println(currentPerson.getAge());
		}
	}
}
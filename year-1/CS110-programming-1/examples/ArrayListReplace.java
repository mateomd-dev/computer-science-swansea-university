import java.util.ArrayList;
import java.util.Scanner;

//Replace item in specific location
public class ArrayListReplace {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<>();
		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		//Copy Array to ArrayList
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(arrayData[i]);
		}
		
		//Print out the array list
		System.out.println("ArrayList Contents"); 
		for(int i = 0; i < arrayListData.size(); i++) {
			System.out.println(arrayListData.get(i));
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the item you want to insert: ");
		String fruit = in.nextLine();
		System.out.print("Enter the location you want to replace: ");
		int location = in.nextInt();
		
		//Print the location of 'fruit' - or -1 if it's not there
		//using  .set() - which *replaces* instead of *inserting*
		arrayListData.add(location, fruit);
		
		//Print it out again
		System.out.println("\nUpdated ArrayList Contents");
		for(int i = 0; i < arrayListData.size(); i++) {
			System.out.println(arrayListData.get(i));
		}

	}
}
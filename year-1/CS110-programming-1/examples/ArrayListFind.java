import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

//Instead of removing something, check if it's there - bad way
public class ArrayListFind {
	public static void main(String[] args) {

		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		ArrayList<String> arrayListData = new ArrayList<>();
		
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(arrayData[i]);
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the item you want to find: ");
		String fruit = in.nextLine();
		
		//.indexOf() can directly find what we are looking for - no need to loop
		System.out.println("Item is at (-1 = not found): " + 
			arrayListData.indexOf(fruit));
	}
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

//Instead of removing something, check if it's there - bad way
public class ArrayListFindBad {
	public static void main(String[] args) {

		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		ArrayList<String> arrayListData = new ArrayList<>();
		
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(arrayData[i]);
		}
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the item you want to find: ");
		String fruit = in.nextLine();
		
		//search for the item - NO! Don't do it like this
		int location = -1; //Will stay -1 if we don't fint it
		for(int i = 0; i < arrayListData.size(); i++){
			if(fruit.equals(arrayListData.get(i))) {
				location = i; //set it to the item location
				break; //one of those times this is OK
			}
		}
		
		System.out.println("Item is at (-1 = not found): " + location);
	}
}
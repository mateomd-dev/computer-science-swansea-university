
import java.util.ArrayList;
//Copy Array to ArrayList, in reverse - method 2, better
public class ArrayListAddToEnd4 {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<String>();
		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		//Print out Array
		System.out.println("Array Contents");
		for(int i = 0; i < arrayData.length; i++) {
			System.out.println(arrayData[i]);
		}
		
		//Copy Array to ArrayList - insert at beginning
		//We call name.add(j,data) which adds data to name at location j
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(0,arrayData[i]);
		}
		
		//Print out ArrayList
		System.out.println("\nArrayList Contents"); //\n is newline
		for(int i = 0; i < arrayListData.size(); i++) {
			System.out.println(arrayListData.get(i));
		}
	}
}
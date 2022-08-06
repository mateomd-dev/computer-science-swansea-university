import java.util.ArrayList;
/* Adding data to an ArrayList - using for-each */
class ArrayListAddForEAch {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<>();
		String[] arrayData = {"lemon", "orange",
					"pineapple", "kiwi", "apple"};
		
		//Print out Array
		System.out.println("Array Contents");
		for(String elem : arrayData) {
			System.out.println(elem);
		}
		
		//Copy Array to ArrayList
		//Calling name.add(data) adds data to ArrayList called name
		for(String elem : arrayData) {
			arrayListData.add(elem);
		}
		
		//Print out ArrayList 
		System.out.println("\nArrayList Contents");
		//used 'val' instead of 'elem' to show you choose the name
		for(String val : arrayListData) {
			System.out.println(val);
		}
	}
}
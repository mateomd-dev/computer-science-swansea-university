import java.util.ArrayList;
//Remove something from an arraylist when you don't know where it is - better way
class ArrayListRemove3 {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<String>();
		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		//Print out Array
		System.out.println("Array Contents");
		for(String elem : arrayData) {
			System.out.println(elem);
		}
		
		//Copy Array to ArrayList
		for(String elem : arrayData) {
			arrayListData.add(elem);
		}
		
		//Print out ArrayList - notice *identical* syntax for Arrays and ArrayLists
		System.out.println("\nArrayList Contents"); //\n is newline
		for(String elem : arrayListData) {
			System.out.println(elem);
		}
		
		//We don't need to know where the Kiwi is in the arraylist - just say we want to remove it
		//This does nothing if the Kiwi is not there in the first place
		System.out.println(arrayListData.remove("kiwi"));
		
		//Print it out again
		System.out.println("\nUpdated ArrayList Contents"); 		
		for(String elem : arrayListData) {
			System.out.println(elem);
		}
	}
}
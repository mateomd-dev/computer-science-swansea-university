import java.util.ArrayList;
//Remove something from an arraylist when you don't know where it is - clumsy way (but lots of people think you have to do it like this)
class ArrayListRemove2 {
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
		
		//Loop to find the kiwi...
		for(int i = 0; i < arrayListData.size(); i++) {
			if (arrayListData.get(i).equals("kiwi")) {
				arrayListData.remove(i);
			}
		}
		
		//Print it out again
		System.out.println("\nUpdated ArrayList Contents"); 		
		for(String elem : arrayListData) {
			System.out.println(elem);
		}
	}
}
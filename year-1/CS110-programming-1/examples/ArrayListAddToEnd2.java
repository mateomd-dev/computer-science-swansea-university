import java.util.ArrayList;
/* Adding data to an ArrayList - this puts the data at the *end*
 * of the ArrayList
 */
class ArrayListAddToEnd2 {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<>();
		String[] arrayData = {"lemon", "orange",
					"pineapple", "kiwi", "apple"};
		
		//Print out Array
		System.out.println("Array Contents");
		for(int i = 0; i < arrayData.length; i++) {
			System.out.println(arrayData[i]);
		}
		
		//Copy Array to ArrayList
		//Calling name.add(data) adds data to ArrayList called name
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(arrayData[i]);
		}
		
		//Print out ArrayList 
		System.out.println("\nArrayList Contents"); 
		for(int i = 0; i < arrayListData.size(); i++) {
			System.out.println(arrayListData.get(i));
		}
	}
}
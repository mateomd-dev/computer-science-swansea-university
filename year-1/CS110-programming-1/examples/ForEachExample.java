import java.util.ArrayList;

/* A program showing how to use the for-each loop - and the point
 * In this program, we print out an Array, fill an ArrayList, and print out
 * an ArrayList two ways - first with a normal for-loop, and then with
 * for-each loop - the for-each loop is *identical* for the Array & ArrayList
 */
public class ForEachExample {
	public static void main(String[] args) {
		ArrayList<String> arrayListData = new ArrayList<>();
		String[] arrayData = {"lemon", "orange", "pineapple", "kiwi", "apple"};
		
		//Print Array
		for(int i = 0; i < arrayData.length; i++) {
			System.out.println(arrayData[i]);
		}
		
		//Copy Array to ArrayList
		for(int i = 0; i < arrayData.length; i++) {
			arrayListData.add(arrayData[i]);
		}
		
		//Print out the array list
		System.out.println("\nArrayList Contents"); 
		for(int i = 0; i < arrayListData.size(); i++) {
			System.out.println(arrayListData.get(i));
		}
		
		//Now do it again - the only thing differing between
		//the loops is the name of the Array or ArrayList - the
		//fact that it *is* an Array or ArrayList is *irrelevant*
		System.out.println("\nNow again, with for-each");
		arrayListData.clear();
		
		//Print Array
		for(String elem : arrayData) {
			System.out.println(elem);
		}
		
		//Copy Array to ArrayList
		for(String elem : arrayData) {
			arrayListData.add(elem);
		}
		
		//Print out the array list
		System.out.println("\nArrayList Contents"); 
		for(String elem : arrayListData) {
			System.out.println(elem);
		}
		
		/*Syntax of for-each
		  for(Type name : List)
		  where Type is e.g. int, String, name is the identifier you choose
		  for the value in the loop, and List is the name of the Array or
		  ArrayList
		*/

	}
}
import java.util.ArrayList;
//Copy Array to ArrayList, using *untyped* ArrayList
class ArrayListNoNo {
	public static void main(String[] args) {
		ArrayList arrayListData = new ArrayList();
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
		arrayListData.add(5);
		
		//Print out ArrayList - notice *identical* syntax for Arrays and ArrayLists
		System.out.println("\nArrayList Contents"); //\n is newline
		for(int i = 0; i < arrayListData.size(); i++) {
			String elem = (String) arrayListData.get(i);
			System.out.println(elem);
		}
	}
}

/* If you don't put <String> in the declaration of the ArrayList, Java will let you put *any* data into it - the trouble is that it then doesn't "really" know what it is when it looks it up! So you have to *tell* it

The line

String elem = (String) arrayListData.get(i);

means 'create a string variable called elem which is whatever is in the ArrayList in the ith element, and
*convert* it into a string.' The '(String)' bit is called a *cast* or *type cast*

This is sort-of OK if you are sure it *is* a string - but if it is you are almost certain to be better off
using <String> when you declare it. Not doing so potentially leads to errors at run time which can be caught
at compile time - and as you see when you compile, it the compiler warns you. You should *only* leave off
<String> (or <Integer>, or whatever the type data you are putting in the array list is) when you *have* to put more than one kind of data in one - which you can almost certainly always avoid doing.
*/
/* This program shows how we should check that strings are equal.
 * 
 * DO NOT USE == FOR CHECKING STRINGS ARE EQUAL - EVEN THOUGH IT OFTEN WORKS
 *
 * In this example, a and b are both the same and if we check that they are equal with ==
 * it 'works' - but *ONLY* because of a detail in how Java works.
 * If we do the same with the first five letters of Lemon Sorbet (which is also Lemon)
 * then it *doesn't* work - to check strings are equal see the last line.
 * We use the substring operator to extract the first five letters of Lemon Sorbet
 */
class Lemon {
	public static void main(String[] args) {
		String a = "Lemon";
		String b = "Lemon";
		String c = "Lemon Sorbet";
		
		System.out.println(a == b);
		
		System.out.println(a==c.substring(0,5));
		
		System.out.println(a.equals(c.substring(0,5)));
	
	}
}
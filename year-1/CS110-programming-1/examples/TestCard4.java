/*
 * This is the TestCard4 class that calls Card4
 *
 * You might have thought about some other issues that come out of this:
 * 1. If we call setNameValue with a string other than one representing a legal
 * card, we get an error -1 (which might not be the best way of reporting an error but it's better than nothing).
 * 2. But we haven't done anything about suites - we can put whatever gibberish in for that we want to. How
 * can we stop that?
 */

public class TestCard4 {
	
	public static void main(String[] args){
			
		//As before...
		Card4 card = new Card4(); 
			
		//Now we set name and value
		card.setNameValue("Ace");
		card.suite = "Spades";
			
		System.out.println(card.toString());
		System.out.println(card.value);
	}
}
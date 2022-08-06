/* This our first attempt at writing a class.
 *
 * This class represents a card, and it collects together the three main properties of a card:
 * - name
 * - value
 * - suite
 *
 * The next class - TestCard1 - creates and 'tests' an *object* of the *class* Card1
 */

class Card1 {
	
	// These are the variables that contain the data about the card. Notice they are
	// 'global' in that they are outside any methods (there aren't actually any - yet)
	// We use the term 'fields'  to refer to these variables
	String name;
	
	int value;
	
	String suite;

}


public class TestCard1 {
	
	public static void main(String[] args){
			
		// First we create a Card1 object
		// The new keyword creates an object called card of class Card1
		// Notice this is basically something we've seen before with, say:
		// Scanner in = new Scanner(System.in); 
		// though the Scanner version has parameters - we'll get to them soon
		Card1 card = new Card1(); 
		
		/* Terminology: Card1 is a *class*; card is an *object* - an *instance* of the Card1 class */
			
		// The next three lines set the values of the variables in the object card
		// Notice the syntax which we've been using already, with, say:
		// String input = in.next();  - except for the (), which we'll get to soon...
		card.name = "Ace";
		card.value = 1;
		card.suite = "Spades";
			
		// Now print out the values we put into card
		System.out.println("Card: " + card.name + " of " + card.suite);
		System.out.println("Value: " + card.value);
		
		// We can create *another* card object (and as many as we want):
		Card1 anotherCard = new Card1();
		anotherCard.name = "King";
		anotherCard.value = 10;
		anotherCard.suite = "Hearts";
		System.out.println("Another Card: " + anotherCard.name + " of " + anotherCard.suite);
	}
}
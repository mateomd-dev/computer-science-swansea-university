/* This our tenth attempt at writing a card class.
 *
 * We're pretty-much finished with cards but I want to use them to illustrate three other issues:
 * 1. Testing
 * 2. The difference between *static* and *dynamic* methods (and variables).
 * 3. Naming conventions for methods that return booleans
 * 
 * TESTING
 * In most of our card examples, we've used a separate test class. But there's no reason why we could not have simply put the main
 * method from TestCard *inside* the Card class. In fact, you can put a main method in *every* class your write if you want. So, if your
 * main program is called StudentRecords and you have another file containing the class Student, they can both contain a main method: the
 * one in StudentRecords can be the 'real' one and the one in Student can contain *testing code* - that is code written solely to test
 * that the Student class works correctly (this is a bit hint BTW). How do you choose which one to run? If you type 'java StudentRecords'
 * you run the one in StudentRecords, and if you type 'java Student' you run the one in Student. This approach to testing - having special code
 * and tests defined to test a *single* class - is called *unit testing*. You will deal with this in more details and sophistication in CS-135
 * in Semester 2. But, in the meantime, you should adopt this approach for coursework2. Two other things:
 * a) For this to be useful, you need to do *careful* and *complete* (or as complete as feasible) testing - you need to consider *all* the cases
 * your code could face (including invalid data) and write a *range* of tests. If you simply run one or two, it's pointless.
 * b) Whenever you make changes to your code you should *rerun* the tests to see if those changes have had any unexpected consequences - this
 * strategy is called *regression testing*.
 *
 * STATIC
 * We have been using the 'static' keyword since the start of the course and probably most of you don't know what it's for or means! Basically,
 * it identifies things that properly belong to *classes* not *objects*. Consider a Card object:
 * Card someCard = new Card("Queen", "Hearts");
 * The *properties* of this card are the suite (Hearts), the name (Queen) and the value (10). Those properties obviously belong to the *card object*
 * because no other card (hopefuly!) will have exactly those. But we can consider other properties too - for example, the number of cards in a deck.
 * That property is the *same* for *all* cards - it's not specific to one. So we would argue that the number of cards in a deck is a property that
 * belongs to the Card *class*. (We might also argue that it really belongs to another class - perhaps one that would be called DeckOfCards - but don't
 * go there:-)
 * 
 * We use the keyword 'static' to identify these properties (fields, methods etc.) that belong to the Class not the objects of the Class. 
 *
 * TERMINOLOGY - IMPORTANT
 * Since we have the keyword 'static' we can talk about 'static methods', 'static variables' etc. But what do we now call the 'non-static' ones?
 * We use the term *instance*. So methods that are not static are *instance methods*, and variables that are not static are *instance variables*.
 * So:
 * If it belongs to an *object* of a Class it is:
 * - an *instance method* or an *instance variable* (or, more properly, an *instance field*).
 * If it belongs to the *Class* itself it is:
 * a *static method* or a *static variable* (or *static field*)
 *
 * BOOLEAN METHODS
 * We have seen *naming conventions* for methods that set 'things' and get the value of 'things' in classes (I won't say set and get variables because
 * the whole point of the methods is so they don't *have* to be variables. Methods that *set* things start with 'set' ('setter' or 'mutator' methods);
 * and methods that *get* things start with 'get' ('getter' or 'accessor' methods).
 * However, there is another conventions - methods that return boolean begin with 'is' and have names that make sense to begin with 'is':-)
 * In this case, we're going to add a method to tell if a card is a picture card - jack, queen, king - or not. It's name will be *isPictureCard*
 */

public class Card10 {
	
	//Here's our static field - the number of cards
	//Because it's static we *do* use the 'all capitals' naming scheme
	private static final int CARDS_IN_DECK = 52;
	
	//But not for these - they are not 'traditional constants'
	private final String name;
	
	private final int value;
	
	private final String suite;
	
	public Card10(String cardName, String suite) {
				
		if (cardName.equalsIgnoreCase("Ace")) {
			value = 1;
			name = cardName;
		} else if (cardName.equalsIgnoreCase("Queen")) {
			value = 10;
			name = cardName;
		} // etc. etc.
		else {
			value = -1; 
			name = "error";
		}
		
		if(suite.equalsIgnoreCase("Hearts") || suite.equalsIgnoreCase("Diamonds")
		|| suite.equalsIgnoreCase("Clubs")  || suite.equalsIgnoreCase("Spades")) {
			this.suite = suite;
		} else {
			this.suite = "error";
		}
	}
	
	//Here's the static method to access the static field
	public static int getCardsInDeck() {
		return CARDS_IN_DECK;
	}

	
	//Here's our boolean method
	public boolean isPictureCard() {
		return(name.equalsIgnoreCase("jack") ||
			   name.equalsIgnoreCase("queen") ||
			   name.equalsIgnoreCase("king"));
	}

	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getSuite() {
		return suite;
	}

	public String toString(){
		return (name + " of " + suite);
	}
	
	//Here's our other static method - the main method to test the class
	public static void main(String[] args){
				
		//Test case - you should have more than this!
		Card10 card = new Card10("Queen", "Spades"); 
		
			
		System.out.println(card.toString());
		System.out.println(card.getValue());
		
		//How to call the static method? Use the *classname*
		System.out.println("Cards in Deck: " + Card10.getCardsInDeck());
		
		//Actually... you can also use *any* object name to access it too:
		System.out.println("Or: " + card.getCardsInDeck());
		//If *at all possible* I think it's clearer to use the *classname*
		//but there could be cases - beyond this module - where you don't
		//actually know it, or at least not conveniently
		
		if(card.isPictureCard()) {
			System.out.println("It's a picture card.");
		} else {
			System.out.println("It's not a picture card.");
		}
	}
}

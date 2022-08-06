/* This our ninth attempt at writing a card class.
 *
 * The last version, Card8, was a pretty good version of a card (given what we know about Java so far). And it may
 * well be the most approprate version for what we want. However, fairly often, with something like a Card class
 * you will create a set of Card objects and then *never* change them - just read their contents. So you might well
 * create a 'Deck' of 52 cards and then do things like store them in an array, or ArrayList, 'shuffle' them etc. - but
 * never actually change the data held in them. In that case it's more appropriate to  *remove* - or at least make
 * invisible - the methods to set the fields.
 */

public class Card9 {
	
	private String name;
	
	private int value;
	
	private String suite;
	
	// Since we're not going to allow the fields to be set after an object has been created,
	// this is the only construtor that makes sense - it's the same as before.
	public Card9(String cardName, String cardSuite) {
		setNameValue(cardName);
		setSuite(cardSuite);
	}
		
	// setNameValue sets the name and value - these are now *private* so can only be called from within the Class
	private void setNameValue(String cardName){
		
		if (cardName.equalsIgnoreCase("Ace")) {
			value = 1;
			name = cardName;
		} else if (cardName.equalsIgnoreCase("Two")) {
			value = 2;
			name = cardName;
		} // etc. etc.
		else {
			value = -1; 
			name = "error";
		}
	}
	
	// setSuite sets the suite. 
	private void setSuite(String suite){
		
		if(suite.equalsIgnoreCase("Hearts") || suite.equalsIgnoreCase("Diamonds")
		|| suite.equalsIgnoreCase("Clubs")  || suite.equalsIgnoreCase("Spades")) {
			this.suite = suite;
		} else {
			suite = "error";
		}
	}

	// get methods
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
}

/* Methods that are 'private' are obviously not accessible outside the class - but they are useful for writing and structuring the
 * code within classes. In this case, we *could* just have copied the code from within each of setNameValue() and setSuite(), and
 * deleted the methods. But (a) that would mean more editing:-); (b) it gives us a way to illustrate private methods; and (c) it
 * may well be clearer to do it that way in any case.
 */



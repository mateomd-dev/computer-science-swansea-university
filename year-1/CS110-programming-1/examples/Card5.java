/* This our fifth attempt at writing a card class.
 *
 * This one adds a method for setting suites
 */

public class Card5 {
	
	String name;
	
	int value;
	
	String suite;
	
	// setNameValue sets the name and value
	public void setNameValue(String cardName){
		
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
	
	// setSuite sets the suite. Notice in this version we have used the *same* name for the
	// parameter to the method as the variable to store the suite - they are both called suite.
	// In the setNameValue method we didn't. There's no special reason for this - just to show
	// that it's possible. But, if you do it, you need to *disambiguate* the parameter suite
	// from the variable suite. We do that by putting the keyword 'this' in front. The keyword
	// 'this' means 'the one belonging to this class' - so 'this.suite' is the *variable* 'suite'
	// and 'suite' is the *parameter* suite. Some programmers like doing this - others avoid it.
	public void setSuite(String suite){
		
		if(suite.equalsIgnoreCase("Hearts") || suite.equalsIgnoreCase("Diamonds")
		|| suite.equalsIgnoreCase("Clubs")  || suite.equalsIgnoreCase("Spades")) {
			this.suite = suite;
		} else {
			this.suite = "error";
		}
	}

	// We'll leave in toString()
	public String toString(){
		return (name + " of " + suite);
	}
}



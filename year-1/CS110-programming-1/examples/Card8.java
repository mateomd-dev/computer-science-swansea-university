/* This our eighth attempt at writing a card class.
 *
 * All our earlier classes, except Card7, came with a 'default' constructor that had no arguments. Our classes
 * have more than one method - so can they have more than one constructor? Yes they can. Do they still have the
 * default no-argument constructor? No, unfortunately not. As soon as you add your own, the default one goes. That
 * can be inconvenient - you may well often just be able to create Card objects with the correct name, value and
 * suite - but maybe not always. Sometimes, you may simply not know the name, value and suite - perhaps you know
 * one or two, or maybe none. So it would be helpful if we could get it back. We can though write our own, but
 * the code that's in it is not obvious
 */

public class Card8 {
	
	private String name;
	
	private int value;
	
	private String suite;
	
	// Here's the constructor from Card7.
	public Card8(String cardName, String cardSuite) {
		// Rather than repeating the code in the methods to set the name, value and suite
		// we just call them - but see important note below
		setNameValue(cardName);
		setSuite(cardSuite);
	}
	
	public Card8(String cardName) {
		// Rather than repeating the code in the methods to set the name, value and suite
		// we just call them - but see important note below
		setNameValue(cardName);
	}

	
	// Here's the 'no-argument' constructor
	public Card8 (){
		//super(); // The keyword 'super' refers to the *superclass* of a class - see note below
	}
	
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
	
	// setSuite sets the suite. 
	public void setSuite(String suite){
		
		if(suite.equalsIgnoreCase("Hearts") || suite.equalsIgnoreCase("Diamonds")
		|| suite.equalsIgnoreCase("Clubs")  || suite.equalsIgnoreCase("Spades")) {
			this.suite = suite;
		} else {
			this.suite = "error";
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

/* Although we don't see it here, all the classes that exist and which we write form part of a *hierarchy*. In object
 * oriented programming languages, classes inherit code (and other things) from some other class, or classes. In
 * Java we call the class we inherit from the *superclass*. Confusingly some other languages call it the *subclass*.
 * Because we haven't said otherwise (see below:-) our Card classes *inherit* from the Object class which contains code
 * for various basic functions - remember the default 'toString()' method from Card2 and TestCard2? The code for that is
 * in the Object class. So the keyword 'super' - in this context - means 'call the default constructor of the superclass'
 * (which is precisely what happens by default if we don't write our own constructor).
 * 
 * Can you *choose* to inherit from another class? Yes you can? Why would you wnat to? That's going to be covered by
 * Xianghua Xie in CS-115. But, as example, consider this. We have been thinking about Card classes without Joker cards.
 * Suppose you wanted a version of Card that could deal with Jokers? Rather than having to rewrite all the code we have
 * so far, it makes sense to be able to reuse that and to *extend* a Card class to add the extra code.
 *
 * Inheritance is a fundamental part of Object Oriented programming - and is key to the concept of *software resuse*:
 * being able to use code for many different purposes (something that Computer Science tried to achieve for several
 * decades until Object Oriented programming became well developed.
 */



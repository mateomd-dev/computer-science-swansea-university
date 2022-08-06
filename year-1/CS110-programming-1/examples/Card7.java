/* This our seventh attempt at writing a card class.
 *
 * Remember we compared our Card classes with Scanner? When we create a new Scanner, we did this:
 *
 * Scanner in = new Scanner(System.in);
 *
 * That is, we were able to specify parameters when we created the Scanner object in. With Card{1-6}
 * we didn't. How do we do this, since it would obviously be handy to create a card with name, value
 * and suite to start with rather than having to call methods to do it.
 *
 * When you create an object of a class, Java calls a sort-of method called a *constructor*. We haven't
 * written one yet - but if you don't Java automatically creates one for you with no parameters. However,
 * we can write our own.
 */

public class Card7 {
	
	private String name;
	
	private int value;
	
	private String suite;
	
	// Here's the constructor - it looks like a method but (a) it has the same name as the
	// class and (b) it has no return type (not even void).
	public Card7(String cardName, String cardSuite) {
		// Rather than repeating the code in the methods to set the name, value and suite
		// we just call them - but see important note below
		setNameValue(cardName);
		setSuite(cardSuite);
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

/* In our constructor, we called the methods we defined already. But notice the syntax was a bit different. When we called them
 * from *outside* the class, we had to put the object name in front (e.g. card.setNameValue("Ace")) but *inside* the class we
 * didn't. This is simply because when we call a method from outside, we have to say which object we mean. For example, if we've
 * created two Card objects - card and lemon - and we want to find out the suite of both of them, we need to differentiate between
 * card and lemon - card.getSuite() and lemon.getSuite(). But within a class, we don't need to do that. 
 *
 * Another point - we put the keyword 'public' in front of the constructor. Given that it seems that the whole point of a
 * constructor is that it's called from outside the class, then it seems there would be no point in it being private, so why
 * to we have to say it's public - couldn't that just be assumed? In fact there *is* a reason to make constructors private - and
 * we won't go into details here (but it's useful if you want to create a fixed group of one or more *constant* objects)
 */



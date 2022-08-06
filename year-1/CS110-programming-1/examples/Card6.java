/* This our sixth attempt at writing a card class.
 *
 * This one adds a method for setting suites
 *
 * So, we now have nice methods to set the suite, value and name avoiding inconsistencies and also
 * preventing cards with wrong data being created. However, what's to stop us doing this:
 *
 * card.setNameValue("King");
 * card.setSuite("Clubs");
 * card.name = "Luke Skywalker";
 * card.value = 1662;
 * card.suite = "Never underestimate the grumpy side of the force";
 *
 * Answer is currently nothing.
 *
 * To stop this, we need to prevent direct access to the fields name, value and suite. We can
 * do this by adding the modifer 'private' to them - this stops them being accessed outside the
 * class Card6. Trouble with this is that we now cannot look up their values either! So code
 * like this wouldn't compile:
 *
 * card.setNameValue("King");
 * String s = card.name;
 *
 * Because name is not 'visible' outside Card6. To fix this we need to add *more* methods to actually
 * give access to the fields.
 *
 * To be completely clear, this is *always* what you should do - you should *never* allow direct access
 * to fields from outside a class - instead you should always use methods. For more info on why, see after
 * the code.
 */

public class Card6 {
	
	private String name;
	
	private int value;
	
	private String suite;
	
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

	public String toString(){
		return (name + " of " + suite);
	}
}

/* Why not allow direct access to fields? Remember when you write a public class you might well be writing code that
 * other people will use - and *keep* using for a long time. Whatever in your class is public will be visible to
 * and used by other programmers. This makes it very difficult for you to change it, because you'll break their code.
 * So you shoud avoid doing *anything* that might make improvements and changes difficult. Here's an example:
 * Suppose you've written a class that deals with interest calculations on an account. You might well implement it
 * with a field that contains the total interest earned at a point in time. If you write your code so that another programmer
 * can directly access that field you are forced to continue to do it. But suppose you find it's better to recalculate the
 * value when you need it rather than storing it (pretty likely actually)? If you've given direct access to the field, you can't
 * change it. If you've used a method, you simply need to change the method to perform the calculation you need - just because our
 * 'get' methods above directly return the value of a field doesn't mean they all have to work like that.
 *
 * Put another way, using methods *hides* details of the implementation of your code from other programmers. You should
 * *always* do this kind of *information hiding* when programming - other programmers need to know *what* your code
 * *does* - *not* how it works (because you should be able to change that, to make it better).
 *
 * This *information hiding* is known as *encapsulation* - and it's possible because classes contain data *and* code.
 */



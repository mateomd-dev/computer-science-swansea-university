/* This our third attempt at writing a card class.
 *
 * In our last test class - TestCard2 - we had a line: card.toString()
 * This calls a method beloning to the Card2 class called toString()
 *
 * This raises two points:
 * 1. We haven't even seen that classes can have methods yet - though you've
 * probably worked that out.
 * 2. We certainly haven't written a toString method though.
 *
 * It turns out that all classes come, but default, with certain methods which
 * often, by default, don't do anything useful. One of these is toString which,
 * by default, prints out the name of the class, and @ sign and something called
 * the *hashcode* of the object it was called from (in this case the object called
 * card), in hexadecimal. So, in the case
 * of Card2 when we called it from TestCard2, it was:
 *
 * Card2@eb42cbf
 *
 * The stuff after the @ will probably be different for you.
 *
 * This doesn't make much sense for us - but notice that it would be a lot more
 * convenient and elegant to not have to keep writing:
 *
 * System.out.println("Card: " + card.name + " of " + card.suite);
 *
 * We can provide our own implementation of toString() that does this, by
 * overriding* the default one.
 */

public class Card3 {
	
	String name;
	
	int value;
	
	String suite;

	// Here's our new toString method - like the original version it returns a string
	// and has no arguments. Why the 'public'? To make the method visible to all the rest
	// of our code
	public String toString(){
		return (name + " of " + suite);
	}
}



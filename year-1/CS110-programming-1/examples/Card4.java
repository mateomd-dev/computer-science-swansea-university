/* This our fourth attempt at writing a card class.
 *
 * In our last version, we added a method that overrode a default one to make
 * it do something more useful. Can we add more methods? Of course - and there's
 * a good reason to do so. Notice that some of the data in the card class is
 * *redundant* - the value follows automatically from the name. As it is, we
 * can create a card and do things like this:
 *
 * card.name = "Ace";
 * card.value = 5;
 *
 * It would be nice to prevent this. In this version, we'll do that by putting
 * in a method that automatically sets the name *and* value. 
 */

public class Card4 {
	
	String name;
	
	int value;
	
	String suite;
	
	// Here's our method
	public void setNameValue(String cardName){
		
		//We could use a switch statement here but it won't work in Java before version 7
		if (cardName.equalsIgnoreCase("Ace")) {
			value = 1;
			name = cardName;
		} else if (cardName.equalsIgnoreCase("Two")) {
			value = 2;
			name = cardName;
		} else { // You get the idea - I'm bored now and I'll skip the rest except...
			value = -1; // to indicate an error - which raises questions...
			name = "error";
		}
	}

	// We'll leave in toString()
	public String toString(){
		return (name + " of " + suite);
	}
}

/* Aside - potentially inconsistent data is something we try very hard to avoid in computer science. Think about entering
 * address data on a website. Many websites now just ask for your postcode and house number/name. That's because your
 * postcode uniquely identifies everything other than your house number/name and so asking for, say, street name etc. means
 * the data is potentially inconsistent (you might enter a postcode that doesn't match the rest of the data).
 */

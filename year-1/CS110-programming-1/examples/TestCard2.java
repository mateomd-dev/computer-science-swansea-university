/*
 * This is the TestCard2 class that calls Card2 - it has to be in a separate
 * file because Card2 is public
 */

public class TestCard2 {
	
	public static void main(String[] args){
			
		//As before...
		Card2 card = new Card2(); 
			
		//Notice the rest of the code is identical
		card.name = "Ace";
		card.value = 1;
		card.suite = "Spades";
			
		System.out.println("Card: " + card.name + " of " + card.suite);
		System.out.println("Value: " + card.value);
		
		//We'll skip the other card here
		
		//Here's an odd thing to do:
		System.out.println(card);
		//This seems to print gibberish...
	}
}
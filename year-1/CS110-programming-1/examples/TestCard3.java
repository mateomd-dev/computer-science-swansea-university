/*
 * This is the TestCard3 class that calls Card3 
 */

public class TestCard3 {
	
	public static void main(String[] args){
			
		//As before...
		Card3 card = new Card3(); 
			
		//Same again
		card.name = "Ace";
		card.value = 1;
		card.suite = "Spades";
			
		//We'll leave this for now
		System.out.println("Card: " + card.name + " of " + card.suite);
		System.out.println("Value: " + card.value);
		
		//We'll skip the other card here
		
		//Here's our version of toString():
		System.out.println(card);
		//Suddenly not gibberish!
		System.out.println(card.toString());
	}
}
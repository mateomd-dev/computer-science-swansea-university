/*
 * This is the TestCard5 class that calls Card5
 */

public class TestCard5 {
	
	public static void main(String[] args){
			
		//As before...
		Card5 card = new Card5(); 
			
		//Now we set name and value
		card.setNameValue("Ace");
		card.setSuite("Spades");
		
		System.out.println(card);
		
		// Lets test the 'error handling'
		Card5 wrongCard = new Card5();
		
		wrongCard.setNameValue("Lemon");
		wrongCard.setSuite("Grapes");
		
		System.out.println(wrongCard.toString());
	}
}
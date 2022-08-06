/*
 * This is the TestCard7 class that calls Card6
 */

public class TestCard7 {
	
	public static void main(String[] args){
			
		//Not quite as before...
		Card7 card = new Card7("Ace", "Spades"); 
			
		System.out.println(card.toString());
		System.out.println(card.getValue());
		
		card.setSuite("Hearts");
		
		System.out.println(card.toString());
		System.out.println(card.getValue());
	}
}
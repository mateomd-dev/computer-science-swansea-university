/*
 * This is the TestCard8 class that calls Card6
 */

public class TestCard8 {
	
	public static void main(String[] args){
			
		//The 'normal' constructor
		Card8 card = new Card8("Ace", "Spades"); 
			
		System.out.println(card.toString());
		
		//The other one:
		Card8 emptyCard = new Card8();
		System.out.println(emptyCard.toString()); // We haven't put anything in it yet
	}
}
/*
 * This is the TestCard9 class that calls Card9
 */

public class TestCard9a {
	
	public static void main(String[] args){
			
		//The constructor
		Card9a card = new Card9a("Ace", "Spades"); 
			
		System.out.println(card);
		
		//If you uncomment this line, you'll find it won't compile because setNameValue is private
		//card.setNameValue("Queen","Hearts");
	}
}
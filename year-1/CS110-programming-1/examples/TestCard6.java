import java.util.Scanner;
public class TestCard6 {
	
	public static void main(String[] args){
			
		//As before...
		Scanner in = new Scanner(System.in);
		Card6 card = new Card6(); 
			
		//Now we set name and value
		card.setNameValue("Ace");
		card.setSuite("Spades");
			
		System.out.println(card.toString());
		
		System.out.println(card.value);
		System.out.println(card.name);
		System.out.println(card.suite);
	}
}
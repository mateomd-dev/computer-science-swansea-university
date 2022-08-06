
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/*
 * This class is also a card deck, but it uses an ArrayList and is a bit
 * more sophisticated
 *
 * We've added a few more methods that would be useful in a 'real' Deck
 */
public class Deck2 {

    private static final int DECK_SIZE = 52;

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck2() {

        // As before but this time add to the arraylist
        //Notice we can call the Card constructor directly
        //as a parameter
        for (Suite s : Suite.values()) {
            for (CardName c : CardName.values()) {
                deck.add(new Card(s, c));
            }
        }

        // Now shuffle the deck
        shuffleDeck();
    }

    // Our toString() method outputs the entire deck,
    // with one card per line - EXACTLY the same
    // code as last time
    public String toString() {
        String result = new String();

        for (Card c : deck) {
            result += c + "\n";
        }
        return result;
    }

    //Shuffle the deck by calling a pre-existing method - we don't have to write our own
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    //Return the size of a *full* deck
    //Alternatively make DECK_SIZE public and use Deck2.DECK_SIZE
    public static int getDeckSize() {
        return DECK_SIZE;
    }

    //Return the value of a random card in the deck - don't remove the card
    public Card cutDeck() {
        return deck.get(new Random().nextInt(deck.size()));
    }

    //Return - and remove - the top card
    public Card dealCard() {
        Card nextCard = deck.get(0);
        deck.remove(0);
        return nextCard;
    }

    //Return a card to the back of the deck
    public void returnCard(Card rtn) {
        deck.add(rtn);
    }

    //How many cards are in the deck now?
    public int getNoCardsInDeck() {
        return deck.size();
    }

    public static void main(String[] args) {
        //Create a new shuffled deck and do some tests
        Deck2 deck = new Deck2();
        System.out.println(deck);

        System.out.println();

        System.out.println("Cut: " + deck.cutDeck());

        Card dealt = deck.dealCard();
        System.out.println("Top card is: " + dealt);
        System.out.println("There are " + deck.getNoCardsInDeck() + " in the deck at the moment");
        deck.returnCard(dealt);
        System.out.println(deck);
    }

}

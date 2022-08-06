
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/*
 * This class is the same as Deck2 but it also lets us sort the deck back into order
 *
 */
public class Deck3 {

    private static final int DECK_SIZE = 52;

    private ArrayList<CardCompare> deck = new ArrayList<CardCompare>();

    public Deck3() {

        // As before but this time add to the arraylist
        //Notice we can call the Card constructor directly
        //as a parameter
        for (SuiteCompare s : SuiteCompare.values()) {
            for (CardName c : CardName.values()) {
                deck.add(new CardCompare(s, c));
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

        for (CardCompare c : deck) {
            result += c + "\n";
        }
        return result;
    }

    //Shuffle the deck by calling a pre-existing method - we don't have to write our own
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    //Return the size of a *full* deck
    public static int getDeckSize() {
        return DECK_SIZE;
    }

    //Return the value of a random card in the deck - don't remove the card
    public CardCompare cutDeck() {
        return deck.get(new Random().nextInt(deck.size()));
    }

    //Return - and remove - the top card
    public CardCompare dealCard() {
        CardCompare nextCard = deck.get(0);
        deck.remove(0);
        return nextCard;
    }

    //Sort the deck into order
    public void order() {
        Collections.sort(deck);
    }

    //Return a card to the back of the deck
    public void returnCard(CardCompare rtn) {
        deck.add(rtn);
    }

    //How many cards are in the deck now?
    public int getNoCardsInDeck() {
        return deck.size();
    }

    public static void main(String[] args) {
        //Create a new shuffled deck and do some tests
        Deck3 deck = new Deck3();
        System.out.println(deck);

        System.out.println();

        deck.order();
        System.out.println(deck);
    }

}

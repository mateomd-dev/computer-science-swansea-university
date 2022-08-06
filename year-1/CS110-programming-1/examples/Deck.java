
import java.util.Random;

/*
 * This class represents a card deck. It has a static constant DECK_SIZE
 * to represent the number of cards, and a constructor to create a sorted
 * deck. The sorthing method is also public, and is parameterised by
 * the number of 'shuffles'
 *
 * We've moved DECK_SIZE to the Deck class from the Card class we had
 * it in before - it's natural home is in Deck - but we didn't have
 * a Deck class until now
 */
public class Deck {

    private static final int DECK_SIZE = 52;

    private Card[] deck = new Card[DECK_SIZE];
    private Random rnd = new Random();

    //Our constructor determines how 'shuffled' our deck is
    public Deck(int shuffleNumber) {
        int deckCounter = 0;

        /* This loop iterates through the possible
		 * values of Suite and CardName - the method values()
		 * is automatically provided for every
		 * enumerated type. Since enumerated types
		 * are basicaly classes, it comes from the
		 * superclass
         */
        for (Suite s : Suite.values()) {
            for (CardName c : CardName.values()) {
                deck[deckCounter] = new Card(s, c);
                deckCounter++;
            }
        }

        // Now shuffle the deck
        shuffleDeck(shuffleNumber);
    }

    // Our toString() method outputs the entire deck,
    // with one card per line
    public String toString() {
        String result = new String();

        for (Card c : deck) {
            result += c + "\n";
        }
        return result;
    }

    //Shuffle the deck by swapping cards shuffles
    //number of times.
    public void shuffleDeck(int shuffles) {

        for (int i = 0; i < shuffles; i++) {
            int swapFrom = rnd.nextInt(DECK_SIZE);
            int swapTo = rnd.nextInt(DECK_SIZE);
            Card temp = deck[swapTo];
            deck[swapTo] = deck[swapFrom];
            deck[swapFrom] = temp;
        }
    }

    //Now create an unshuffled Deck, then shuffle it
    public static void main(String[] args) {
        //Create a deck shuffled zero times
        Deck deck = new Deck(0);
        System.out.println(deck.toString());
        //Now shuffle 100 times
        deck.shuffleDeck(100);
        System.out.println();
        System.out.println(deck);
    }

}

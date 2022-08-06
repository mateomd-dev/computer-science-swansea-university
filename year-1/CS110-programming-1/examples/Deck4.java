
import java.util.Random;

/*
 * Represents a deck of {@link Card} objects with suite represented by
 * {@link Suite} enumerated type; and name and numeric value by
 * {@link CardName} enumerated type.
 * <p>
 * Currently, the functionality of the Deck class is limited to shuffling.
 */
public class Deck {

    private static final int DECK_SIZE = 52;

    private Card[] deck = new Card[DECK_SIZE];
    private Random rnd = new Random();

    /**
     * Create a Deck object shuffled a specified number of times.
     * <p>
     * <emph>Shuffle</emph> in this context means swapping a randomly-generated pair
     * of cards.
     * <h6>Note</h6>
     * It is possible for a single shuffle to swap a card with itself leaving
     * the deck unchanged.
     *
     * @param shuffleNumber the number of shuffles to be applied to the new
     * deck.
     */
    public Deck(int shuffleNumber) {
        int deckCounter = 0;

        // Create an initially-sorted deck
        for (Suite s : Suite.values()) {
            for (CardName c : CardName.values()) {
                deck[deckCounter] = new Card(s, c);
                deckCounter++;
            }
        }

        // Now shuffle the deck
        shuffleDeck(shuffleNumber);
    }

    /**
     * Output the deck to a string, formatted one card per line.
     *
     * @return the deck as a formatted String object.
     */
    public String toString() {
        String result = new String();

        for (Card c : deck) {
            // Note that deck[deckCounter]
            // *implicitly* calls the
            // toString() method of Card
            result += c + "\n";
        }
        return result;
    }

    /**
     * Shuffle the deck a specificed number of times
     *
     * @param shuffles the required number of card shuffles (random swaps)
     */
    public void shuffleDeck(int shuffles) {

        for (int i = 0; i < shuffles; i++) {
            int swapFrom = rnd.nextInt(DECK_SIZE);
            int swapTo = rnd.nextInt(DECK_SIZE);
            Card temp = deck[swapTo];
            deck[swapTo] = deck[swapFrom];
            deck[swapFrom] = temp;
        }
    }

    /**
     * Test Deck class only. Currently creates a zero-shuffled deck, outputs it,
     * then shuffles 100 times and outputs again.
     *
     * @param args unused command line arguments
     */
    public static void main(String[] args) {
        //Create a deck shuffled zero times
        Deck deck = new Deck(0);
        System.out.println(deck.toString());
        //Now shuffle 100 times
        deck.shuffleDeck(100);
        System.out.println();
        System.out.println(deck.toString());
    }

}

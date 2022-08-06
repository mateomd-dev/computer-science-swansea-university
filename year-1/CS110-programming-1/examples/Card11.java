
/**
 * This class represents a card using the {@link Suite} and {@link CardName}
 * enumerated types.
 * <p>
 * With appropriate definitions of <code>Suite</code> and <code>CardName</code>,
 * this class should be suitable for any kind of card that can be characterised
 * by a suite, a name and a numeric value.
 */

public class Card {

    //Because these are *final* any Card object once create cannot
    //be changed - we call such objects *immutable*
    //Because these things are not *public* we don't use javadoc comments
    private final Suite suite;
    private final CardName name;

    /**
     * Creates an immutable Card object.
     *
     * @param suiteVal the card's suite
     * @param cardVal the card's name
     */
    public Card(Suite suiteVal, CardName cardVal) {
        name = cardVal;
        suite = suiteVal;
    }

    /**
     * The suite of the Card object represented by the Suite enumerated type.
     *
     * @return the value of the Suite
     */
    public Suite getSuite() {
        return suite;
    }

    /**
     * The name of the Card object represented by the CardName enumerated type.
     *
     * @return the name of the Suite
     */
    public CardName getName() {
        return name;
    }

    /**
     * The numeric value of the Card object represented by the value within the
     * appropriate CardName enumerated type object.
     *
     * @return the value of the Suite
     */
    public int getValue() {
        return name.cardScore();
    }

    /**
     * The Card object as a String formatted in the traditional way.
     *
     * @return the Card as a String
     */
    public String toString() {
        return (name + " of " + suite);
    }
}

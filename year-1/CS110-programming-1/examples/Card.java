/*
 * This is our new Card class - it uses the two enumerated types
 * and only permits the values defined in those enumerated types,
 * which removes all need to deal with errors in the values we
 * use (because it's *impossible* to use the incorrect values)
 */

public class Card {

    private final Suite suite;
    private final CardName name;

    public Card(Suite suiteVal, CardName cardVal) {
        name = cardVal;
        suite = suiteVal;
    }

    public Suite getSuite() {
        return suite;
    }

    public CardName getName() {
        return name;
    }

    public int getValue() {
        return name.value();
    }

    public String toString() {
        return (name + " of " + suite);
    }
}

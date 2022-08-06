/*
 * This is a more complex enumerated type - it shows that you
 * can actually include code - and enumerated types are
 * really just a kind of specialised class. Each element
 * is an object in itself and the name of each element when
 * it's defined is a call to a constructor. In the other type
 * (Suite) the constructors have no arguments (and not even
 * brackets). But in this one, we *do* have parameters - the
 * value of the card - and also some methods
 */

public enum CardName {
    ACE(1), // These enum items are also construtor calls
    TWO(2), // to the constructor CardName below
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int value;

    // As well as creating the CardName Objects
    // ACE ... KING, they also add a *value*
    // to each one
    CardName(int cardValue) {
        value = cardValue;
    }

    public int value() {
        return value;
    }
}

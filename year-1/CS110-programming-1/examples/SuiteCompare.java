/*
 * Enumerated type representing suites.
 *
 * This version has an *ordering* for the suites
 */

public enum SuiteCompare {
    //This a *new type* with only these values allowed
    SPADES(4), HEARTS(3), DIAMONDS(2), CLUBS(1);

    private final int value;

    SuiteCompare(int suiteValue) {
        value = suiteValue;
    }

    public int value() {
        return value;
    }

}

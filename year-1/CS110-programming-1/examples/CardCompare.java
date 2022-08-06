/*
 * This is another new card class - this one allows us to
 * *compare* one card to another
 */

public class CardCompare implements Comparable<CardCompare> {

    private final SuiteCompare suite;
    private final CardName name;

    public CardCompare(SuiteCompare suiteVal, CardName cardVal) {
        name = cardVal;
        suite = suiteVal;
    }

    public SuiteCompare getSuite() {
        return suite;
    }

    public CardName getName() {
        return name;
    }

    public int getValue() {
        return name.value();
    }

    public int getSuiteValue() {
        return suite.value();
    }

    public String toString() {
        return (name + " of " + suite);
    }

    public int compareTo(CardCompare card) {

        if (card.getValue() < name.value()) {
            return 1;
        } else if (card.getValue() > name.value()) {
            return -1;
        } else if (card.getSuiteValue() < suite.value()) {
            return 1;
        } else if (card.getSuiteValue() > suite.value()) {
            return -1;
        } else {
            return 0;
        }
    }
}

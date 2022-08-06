/*
 * Enumerated type representing suites.
 *
 * Enumerated types are useful when you have a smallish fixed
 * set of values and don't want to permit any others.
 *
 * If the list of allowed values is small eough, enumerated types
 * are very useful
 */

public enum Suite {
    //This a *new type* with only these values allowed
    CLUBS, DIAMONDS, HEARTS, SPADES
}


/**
 * The CardName enumerated type represents the names and values of
 * cards in a deck.
 */

public enum CardName {
    ACE(1), // This time we'll leave out individual comments
    TWO(2), // for each element of the eum
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

    //We can have an ordinary comment to explain what this
    //is but *not* a javadoc one - it's a *private* field
    //and nobody *using* the class needs to know about it
    private final int value;

    // Same again - the constructor isn't needed outside
    // the enum, so no need for a javadoc comment
    CardName(int cardValue) {
        value = cardValue;
    }

    //The method below on the other hand, *is* called
    //from outside the class
    /**
     * Returns the value associated with a particular card.
     *
     * @return the value associated with a card
     * @deprecated Use <code>cardScore</code> instead.
     * <p>
     * The name of method is too close to <code>values</code> which returns an
     * array containing the <code>enum</code
     * objects.
     */
    @Deprecated //What's this??
    public int value() {
        return cardScore();
    }

    //Notice we can put HTML tags like <p> (and any others we want)
    //in to format the comment. We use the <code> tag to format
    //code correctly.
    /**
     * Returns the value associated with a card.
     *
     * @return the value associated with a card
     * <p>
     * Use in preference to <code>value</code>.
     * @see #value()
     */
    public int cardScore() {
        return value;
    }
}


/* What's all this @ stuff and Deprecated stuff?
 *
 * In javadoc comments, @ is used to start a *tag* which the javadoc application uses to extract information.
 *
 * There are three in this example:
 * @return - is a very common one and is used to explain *what* a method returns. NOTE we *don't* say things like
 * 'returns an int' because javadoc can *automatically* get that from the code. We say what the return value
 * *means*.
 *
 * @see - this is used to *cross reference* to something else in the same code file. This isn't used so often. The
 * syntax is; @see #thing-to-reference - in this case it's a method so: @see #value()
 *
 * @deprecated - something in java that is *deprecated* should, ideally, not be used anymore. Why not just take it
 * out? Because existing code might already use it and it could be a big job to change that. So better to leave
 * the old stuff in and change the documentation to 'encourage' programmers to update their code.
 *
 * You'll notice that there's also a @Deprecated tag *outside* the comments. This is a different kind of tag
 * called an *annotation* and, because it's outside the comment, it's for the *compiler* not javadoc. This one
 * tells the compiler that the code is deprecated so if anyone uses it, it generates a warning. This also encourages
 * programmers to stop using the old code.
 *
 * Can we just take it out? Eventually, yes - but in practice it's years before old code is revised.
 */

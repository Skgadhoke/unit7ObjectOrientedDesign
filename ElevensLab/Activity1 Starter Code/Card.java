/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;


    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>String</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>String</code> value
     *                  containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.suit=cardSuit;
        this.rank=cardRank;
        this.pointValue=cardPointValue;
    }


     /**
      * Accesses this <code>Card's</code> suit.
      * @return this <code>Card's</code> suit.
      */
     public String suit() {
         return this.suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return this.rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        return this.pointValue;
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
                    */
    public boolean matches(Card otherCard) {
        String str1=otherCard.rank();
        String str2=otherCard.suit();
        int val=otherCard.pointValue();
        
        if(this.rank == str1 && this.suit ==str2 && this.pointValue==val) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
        String str = this.rank + "of" + this.suit + "(point value = " + pointValue;
        
        return str;
    }
}

package PokerHandSimulator;

public class Deck implements Cloneable {

    public Card[] deck = new Card[52];

    /**
     * Constructor for the Deck class
     */
    public Deck(boolean build) {
        if (build) {
            deckBuilder();
        }
    }

    /**
     * Adds a card to the deck using string values
     * @param value the value of the card
     * @param suit the suit of the card
     * @return the card
     */
    public Card addCard(String value, String suit) {
        return new Card(value, suit);
    }

    /**
     * Adds a card to the deck using integer values
     * @param value the value of the card
     * @param suit the suit of the card
     * @return the card
     */
    public Card addCard(int value, int suit) {
        return new Card(value, suit);
    }

    /**
     * Removes the card at the specified index
     * @param cardIndex the index of the card
     */
    public void removeCard(int cardIndex) {
        this.deck[cardIndex] = null;
    }

    /**
     * Builds the deck
     */
    public void deckBuilder() {
        for (int suit = 0 ; suit < 4; suit++) {
            for (int i = 0; i < 13; i++) {
                this.deck[i + (suit * 13)] = addCard(i, suit);
            }
        }

    }

    /**
     * Clones the deck
     * @return the cloned deck
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * Gets the card at the specified index
     * @param cardIndex the index of the card
     * @return the card at the specified index
     */
    public Card get(int cardIndex) {
        return deck[cardIndex];
    }
}

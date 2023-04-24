package classintro.PokerHandSimulator;

public class Deck {

    public Card[] deck = new Card[52];

    /**
     * Constructor for the Deck class
     */
    public Deck() {
        deckBuilder(0);
    }

    public Deck(boolean build) {
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
     * @param suit the suit of the card
     */
    public void deckBuilder(int suit) {
        if (suit < 4) {
            for (int i = 0; i < 13; i++) {
                this.deck[i + (suit * 13)] = addCard(i, suit);
            }
            deckBuilder(suit+1);
        }

    }

    /**
     * Clones the deck
     * @return the cloned deck
     */
    public Deck clone() {
        Deck tempDeck = new Deck(false);
        for (int i = 0; i < deck.length; i++) {
            tempDeck.deck[i] = deck[i];
        }
        return tempDeck;
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

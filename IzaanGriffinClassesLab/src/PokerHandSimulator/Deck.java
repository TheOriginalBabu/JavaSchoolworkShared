package classintro.PokerHandSimulator;

public class Deck {

    public Card[] deck = new Card[52];

    public Deck() {
        deckBuilder(0);
    }
    public Card addCard(String value, String suit) {
        return new Card(value, suit);
    }

    public Card addCard(int value, int suit) {
        return new Card(value, suit);
    }

    public void removeCard(int cardIndex) {
        this.deck[cardIndex] = null;
    }

    public void deckBuilder(int suit) {
        if (suit < 4) {
            for (int i = 0; i < 13; i++) {
                this.deck[i + (suit * 13)] = addCard(i, suit);
            }
            deckBuilder(suit+1);
        }

    }

    public Card get(int cardIndex) {
        return deck[cardIndex];
    }
}

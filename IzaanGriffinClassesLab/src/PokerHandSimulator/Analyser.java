package classintro.PokerHandSimulator;

public class Analyser {

    int[] values = new int[5];
    String[] suits = new String[5];

    /**
     * Constructor for the Analyser class
     */
    public Analyser() {
    }

    /**
     * Sorts the values array from lowest to highest
     * @param array the array to be sorted
     */
    private void sortingAlgorithm(int[] array) {
        //todo implement sorting algorithm
    }

    /**
     * Finds the best hand from the hand
     * @return the best hand
     */
    public String bestHandFinder(Hand hand) {
        for (int i = 0; i < hand.hand.length; i++) {
            values[i] = Integer.parseInt(hand.hand[i].value);
            suits[i] = hand.hand[i].suit;
        }

        sortingAlgorithm(values);
        if (royalFlushChecker()) {
            return "Royal Flush";
        } else if (straightFlushChecker()) {
            return "Straight Flush";
        } else if (fourKindChecker()) {
            return "Four of a Kind";
        } else if (fullHouseChecker()) {
            return "Full House";
        } else if (flushChecker()) {
            return "Flush";
        } else if (straightChecker()) {
            return "Straight";
        } else if (threeKindChecker()) {
            return "Three of a Kind";
        } else if (twoPairChecker()) {
            return "Two Pair";
        } else if (pairChecker()) {
            return "Pair";
        } else {
            return highCardChecker();
        }
    }

    /**
     * Checks if the hand is a royal flush
     * @return true if the hand is a royal flush
     */
    private boolean royalFlushChecker() {
        //todo implement royal flush checker
        return false;
    }

    /**
     * Checks if the hand is a straight flush
     * @return true if the hand is a straight flush
     */
    private boolean straightFlushChecker() {
        //todo implement straight flush checker
        return false;
    }

    /**
     * Checks if the hand is a four of a kind
     * @return true if the hand is a four of a kind
     */
    private boolean fourKindChecker() {
        //todo implement four of a kind checker
        return false;
    }

    /**
     * Checks if the hand is a full house
     * @return true if the hand is a full house
     */
    private boolean fullHouseChecker() {
        //todo implement full house checker
        return false;
    }

    /**
     * Checks if the hand is a flush
     * @return true if the hand is a flush
     */
    private boolean flushChecker() {
        //todo implement flush checker
        return false;
    }

    /**
     * Checks if the hand is a straight
     * @return true if the hand is a straight
     */
    private boolean straightChecker() {
        //todo implement straight checker
        return false;
    }

    /**
     * Checks if the hand is a three of a kind
     * @return true if the hand is a three of a kind
     */
    private boolean threeKindChecker() {
        //todo implement three of a kind checker
        return false;
    }

    /**
     * Checks if the hand is a two pair
     * @return true if the hand is a two pair
     */
    private boolean twoPairChecker() {
        //todo implement two pair checker
        return false;
    }

    /**
     * Checks if the hand is a pair
     * @return true if the hand is a pair
     */
    private boolean pairChecker() {
        //todo implement pair checker
        return false;
    }

    /**
     * Checks if the hand is a high card
     * @return true if the hand is a high card
     */
    private String highCardChecker() {
        //todo implement high card checker
        return null;
    }
}

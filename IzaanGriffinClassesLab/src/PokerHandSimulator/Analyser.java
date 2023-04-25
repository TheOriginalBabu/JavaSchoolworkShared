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
        String[] tempValues = new String[5];
        for (int i = 0; i < hand.hand.length; i++) {
            tempValues[i] = hand.hand[i].value;
            suits[i] = hand.hand[i].suit;
        }
        // converts the values to integers
        for (int i = 0; i < tempValues.length; i++) {
            switch (tempValues[i]) {
                case "ACE":
                    values[i] = 14;
                    break;
                case "KING":
                    values[i] = 13;
                    break;
                case "QUEEN":
                    values[i] = 12;
                    break;
                case "JACK":
                    values[i] = 11;
                    break;
                default:
                    values[i] = Integer.parseInt(tempValues[i]);
                    break;
            }
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
        //royal flush is a straight flush with a high card of 10
        return (flushChecker() && straightChecker() && highCardChecker().equals("ACE"));
    }

    /**
     * Checks if the hand is a straight flush
     * @return true if the hand is a straight flush
     */
    private boolean straightFlushChecker() {
        return (flushChecker() && straightChecker());
    }

    /**
     * Checks if the hand is a four of a kind
     * @return true if the hand is a four of a kind
     */
    private boolean fourKindChecker() {
        // checks if have 4 cards with same value
        for (int i = 0; i < values.length - 3; i++) {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the hand is a full house
     * @return true if the hand is a full house
     */
    private boolean fullHouseChecker() {
        // 3 of a kind and 2 of a kind
        return (threeKindChecker() && pairChecker());
    }

    /**
     * Checks if the hand is a flush
     * @return true if the hand is a flush
     */
    private boolean flushChecker() {
        //loop through suit array and check if all suits are the same
        for (int i = 0; i < suits.length - 1; i++) {
            if (!suits[i].equals(suits[i + 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the hand is a straight
     * @return true if the hand is a straight
     */
    private boolean straightChecker() {
        // check if the values are consecutive
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] + 1 != values[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the hand is a three of a kind
     * @return true if the hand is a three of a kind
     */
    private boolean threeKindChecker() {
        // checks if 3 cards with same value
        for (int i = 0; i < values.length - 2; i++) {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2]) {
                return true;
            }
        }
    return false;
    }


    /**
     * Checks if the hand is a two pair
     * @return true if the hand is a two pair
     */
    private boolean twoPairChecker() {
    // checks if there are two pairs
        int pairCount = 0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                pairCount++;
            }
        }
        return pairCount == 2;
    }

    /**
     * Checks if the hand is a pair
     * @return true if the hand is a pair
     */
    private boolean pairChecker() {
        // checks if 2 cards have the same value
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the hand is a high card
     * @return highest card
     */
    private String highCardChecker() {
        // returns the highest card
        return String.valueOf(values[values.length - 1]);
    }
}

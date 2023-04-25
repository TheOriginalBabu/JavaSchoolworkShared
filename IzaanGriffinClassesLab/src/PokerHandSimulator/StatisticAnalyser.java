package classintro.PokerHandSimulator;

public class StatisticAnalyser {

    public int[] handCount = new int[10];
    public String[] handNames = {"Royal Flush", "Straight Flush", "Four of a Kind", "Full House", "Flush", "Straight", "Three of a Kind", "Two Pair", "Pair", "High Card"};

    /**
     * Constructor for the StatisticAnalyser class
     */
    public StatisticAnalyser() {
        Deck deck = new Deck(true);
        Analyser analyser = new Analyser();

        handCounter(deck, analyser);

        printHandPercents();
    }


    /**
     * Counts the number of each hand type
     * @param deck the deck to be used
     * @param analyser the analyser to be used
     */
    public void handCounter(Deck deck, Analyser analyser) {
        Hand hand;
        try {
            for (int i = 0; i < 1000; i++) {
                hand = new Hand((Deck) deck.clone());
                switch (analyser.bestHandFinder(hand)) {
                    case "Royal Flush" -> handCount[0]++;
                    case "Straight Flush" -> handCount[1]++;
                    case "Four of a Kind" -> handCount[2]++;
                    case "Full House" -> handCount[3]++;
                    case "Flush" -> handCount[4]++;
                    case "Straight" -> handCount[5]++;
                    case "Three of a Kind" -> handCount[6]++;
                    case "Two Pair" -> handCount[7]++;
                    case "Pair" -> handCount[8]++;
                    case "High Card" -> handCount[9]++;
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints the percentage of each hand type
     */
    public void printHandPercents() {
        double[] handPercents = new double[10];

        for (int i = 0; i < handCount.length; i++) {
            handPercents[i] = ((double) handCount[i] / 10000) * 100;
        }

        for (int i = 0; i < handPercents.length; i++) {
            System.out.println(handNames[i] + ": " + handPercents[i] + "%");
        }
    }
}

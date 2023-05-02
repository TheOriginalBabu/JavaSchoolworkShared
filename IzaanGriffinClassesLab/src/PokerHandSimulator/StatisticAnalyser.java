package PokerHandSimulator;

import java.text.DecimalFormat;

public class StatisticAnalyser {

    public int[] handCount = new int[10];
    public String[] handNames = {"Royal Flush", "Straight Flush", "Four of a Kind", "Full House", "Flush", "Straight", "Three of a Kind", "Two Pair", "Pair", "High Card"};
    public double[] actualHandPercents = {0.000154, 0.00139, 0.0240, 0.1441, 0.1965, 0.3925, 2.1128, 4.7539, 42.2569, 50.1177};
    public long totalHands;
    private static final DecimalFormat df = new DecimalFormat("0.00000");

    /**
     * Constructor for the StatisticAnalyser class
     */
    public StatisticAnalyser(long hands) {

        this.totalHands = hands;

        Analyser analyser = new Analyser();

        handCounter(analyser);

        printHandPercents();
    }


    /**
     * Counts the number of each hand type
     * @param analyser the analyser to be used
     */
    public void handCounter(Analyser analyser) {

            for (int i = 0; i < totalHands; i++) {
                Hand hand = new Hand(new Deck(true));
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

    }

    /**
     * Prints the percentage of each hand type
     */
    public void printHandPercents() {
        double[] handPercents = new double[10];
        String paddedHandName;

        for (int i = 0; i < handCount.length; i++) {
            handPercents[i] = ((double) handCount[i] / totalHands) * 100;
        }

        System.out.println("Hand Type\t\t|\tResults\t\t|\tExpected\t|\tDifference\n---------------------------------------------------------------");

        for (int i = 0; i < handPercents.length; i++) {
            paddedHandName = String.format("%-13s", handNames[i]);
            System.out.println(paddedHandName + "\t|\t" +  df.format(handPercents[i]) + "%\t|\t" + df.format(actualHandPercents[i]) + "%\t|\t" + (df.format(handPercents[i] - actualHandPercents[i])) + "%");
        }
    }
}

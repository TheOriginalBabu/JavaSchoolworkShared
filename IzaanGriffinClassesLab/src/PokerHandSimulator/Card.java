package classintro.PokerHandSimulator;

import java.util.Arrays;


/**
 *
 * @author ljohnstonflanagan
 * @description This class is linked with the ClassIntro.java class, as part
 *              of a lesson on an introduction to classes. It serves to provide
 *              an example through modeling playing cards.
 */
public class Card {
    // These variables are called "attributes" of the class.
    // Each instance (also called an object) of the class will have
    // these attributes, and can have their own unique values for them.
    // Atrributes are also called fields.
    
    //notice that these don't have the "static" keyword that we have been using?
    //that is because we do not want them to be static. We want each instance of
    //the card object to be able to have different values and suits.
    public String value;
    public String suit;
    
    // Below, suits, is both a private, and a static field of the Card class. 
    // private means that it can only be access from within the class
    // (this means that in ClassIntro exampleCard.suits won't show up and can't be used)
    // static means that it does not change from Card object to Card object (in other words,
    // every Card will have the same array of suits).
    private static String[] suits = {"CLUBS","DIAMONDS","HEARTS","SPADES"};
    private static String[] values = {"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
    
    // This method is a constructor. When instances of the Card
    // are created (also known as an Object) the constructor is automatically
    // called. It is used for assigning values to the attributes of an object. 
    public Card(String newValue, String newSuit){
        //this refers to the instance of the class.
        //in other words, the Card object that is being created here
        this.value = newValue;
        this.suit = newSuit;
    }

    public Card(int newValue, int newSuit){
        //this refers to the instance of the class.
        //in other words, the Card object that is being created here
        this.value = values[newValue];
        this.suit = suits[newSuit];
    }

    //this is an overloaded constructor allows us to create Card objects with 
    //random values using the methods below
    public Card(){
        randomCard();
    }
    public Card(String newSuit){
        randomCard(newSuit);
    }
    //Classes can also have methods that each class object would possess.
    //This method will display the value of the card.
    public void showCard(){
        System.out.println(this.value + " of " + this.suit);
    }
    
    //This method is a demo for private vs public 
    public void showPrivate(){
        System.out.println(Arrays.toString(suits));
        System.out.println(Arrays.toString(values));
    }
    //This method will change a card into a new random card. It is overloaded to 
    // allow for picking a suit or not
    public void randomCard(String newSuit){
        int randomValue = (int)(Math.random() * values.length);
        this.suit = newSuit;
        this.value = values[randomValue];
    }
    
    public void randomCard(){
        int randomValue = (int)(Math.random() * values.length);
        int randomSuit = (int)(Math.random() * suits.length);
        this.suit = suits[randomSuit];
        this.value = values[randomValue];
    }
}

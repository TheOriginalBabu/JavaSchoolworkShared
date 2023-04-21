
package PokerHandSimulator;

import java.util.Arrays;

/**
 *
 * @author ljohnstonflanagan
 * @date 22-Apr-2022
 * @filename ClassIntro.java
 * @description A program that serves as a lesson for an introduction to classes in java.
 *              This file (ClassIntro.java) will serve as our "main" class. You will also
 *              need to reference CardsExample.java as part of this lesson.
 */

public class ClassIntro {
    
    public static void main(String[] args) {
        // Here we create a Card object called exampleCard. This is much 
        // the same as any other time we have made instances of an object (like a Scanner),
        // only now we are using our own custom class!
        Card exampleCard = new Card("4","CLUBS"); 
        System.out.println("EXAMPLE CARD 1");
        exampleCard.showCard(); //here we call the showCard() method.
        
        //Private fields or methods can only be called from within the class
        //System.out.println(Arrays.toString(exampleCard.suits)); This will error as suits is private
        System.out.println("\nPRIVATE EXAMPLE");
        exampleCard.showPrivate();//but this works as showPriavte is public
        
        //Below are two examples of using the overloaded constructor 
        Card exampleCard2 = new Card("CLUBS"); 
        System.out.println("\nEXAMPLE CARD 1");
        exampleCard2.showCard(); 
        Card exampleCard3 = new Card(); 
        System.out.println("\nEXAMPLE CARD 3");
        exampleCard3.showCard(); 
        
        //We can directly change the values of the fields of an object like so.
        exampleCard3.suit = "CHANGED";
        exampleCard3.value = "NEW VALUE";
        System.out.println("\n EXAMPLE CARD 3b");
        exampleCard3.showCard();
        
        //Like any other object or variable type, we can create an array of objects of
        //our custom classes if we wish.
        Card hand[] = new Card[5]; 
        System.out.println("\nYour hand is: ");
        for (int x = 0; x<hand.length;x++){
            hand[x] = new Card();//assign random values to the fields
            hand[x].showCard();//show the card
        }
    }

}

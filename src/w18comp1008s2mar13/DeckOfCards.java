package w18comp1008s2mar13;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards()
    {
        //creating a deck of cards
        deck = new ArrayList<>();
        String[] faceNames = { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] validSuits = {"hearts","spades","clubs","diamonds"}; 
    
        for (String suit : validSuits)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suit));
        }
    }
    
    public void displayDeck()
    {
        for (Card card:deck)
        {
            System.out.println(card);
        }
    }
}

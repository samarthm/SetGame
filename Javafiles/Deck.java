/**
 *  Represents a generic deck of cards.
 */

/*

Tips:

- Use an ArrayList<Card> to hold the cards.
- Add and remove cards at the end of the list.
- Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
or write your own methods.  If you write your own, use selection sort
to sort and a similar algorithm to shuffle.  Use Math.random().
- In the toString method, separate strings for individual cards with "\n".

 */

import java.util.*;

public class Deck
{
    ArrayList <Card> a;
    public Deck ( ) {
        a = new ArrayList <Card>();
    }

    public Deck (int capacity) {
        a = new ArrayList <Card>(capacity);
    } 

    public int getNumCards ( ) {
        return a.size();
    }

    public boolean isEmpty ( ) {
        if (a.size()==0)
            return true;
        else return false;
    }

    public void add (Card c) {
        a.add(c);
    }

    public Card takeTop ( ) {
        return a.remove(0);
    } 

    public void shuffle ( ){
        Collections.shuffle(a);
    }

    public void sort ( ){
        Collections.sort(a);
    }

    public String toString ( ) {
        Card c;
        String l=" ";
        for (int n=0; n<a.size(); n++){
            c=a.get(n);
            l+= c.toString() + "\n";
        }
        return l;
    }
}
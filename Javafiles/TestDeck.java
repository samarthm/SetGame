
/**
 * Write a description of class TestDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TestDeck
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        for (int i = 1; i<=5; i++)
        {
            //deck.add(new Card(i));
            deck.add(new Card((int)(Math.random()*5+1)));
        }
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        deck.sort();
        System.out.println(deck);
        for (int i = 1; i<=4; i++)
        {
            deck.takeTop();
            System.out.println(deck);
        }
    }   
}

/**
 * Write a description of class ZetDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZetDeck extends Deck
{
    public ZetDeck()
    {
        super();
        
        for (int x=1; x<=3; x++){
            for (int y=1; y<=3; y++){
                for (int z=1; z<=3; z++){
                    for (int a=1; a<=3; a++){
                        Card c=new ZetCard(x, y, z, a);
                        add(c);
                    }
                }
            }
        }
    }
}

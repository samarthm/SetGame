/**
 *  Provides static methods for finding sets.
 */

/*

Tips:

- Given a, b, c from {1, 2, 3}, they are all equal or all different if and only if
(a + b + c) % 3 == 0.  This property can be used for testing three cards for a set
easily.

(For more mathematically inclined, the SET deck corresponds to the 4-dimensional vector
space over the algebraic field {0, 1, 2} with modulo 3 arithmetic.  Three cards form a "set"
if and only if the sum of the corresponding vectors is 0.)

- isZet and findZet are static methods.

- in isZet, don't forget to check that the cards are not all the same.

- Note that an array passed to findZet can have nulls in some of the elements.

 */

public class ZetAnalyzer
{
    public ZetAnalyzer()
    {

    }

    public static boolean isZet (ZetCard card1, ZetCard card2, ZetCard card3)
    {
        if (card1.compareTo(card2) == 0 || card2.compareTo(card3) == 0 || card1.compareTo(card3) == 0)
            return false;
        else if ((card1.getColor() + card2.getColor() + card3.getColor()) % 3 != 0)
            return false;
        else if ((card1.getFill() + card2.getFill() + card3.getFill()) % 3 != 0)
            return false;
        else if ((card1.getNumber() + card2.getNumber() + card3.getNumber()) % 3 != 0)
            return false;
        else if ((card1.getShape() + card2.getShape() + card3.getShape()) % 3 != 0)
            return false;
        else
            return true;
    }

    public static int[] findZet (ZetCard[] cards)
    {
        ZetCard c1;
        ZetCard c2;
        ZetCard c3;
        for (int x = 0; x < cards.length; x++){
            c1= cards[x];
            if (c1 == null)
                return null;
            for (int y = 0; y < cards.length; y++){
                c2= cards[y];
                if (c2 == null)
                    break;
                for (int z = 0; z < cards.length; z++){
                    c3= cards[z];
                    if (c3 == null)
                        break;
                    if (isZet(c1,c2,c3)){
                        int[] zet={x,y,z};
                        return zet;
                    }
                }
            }
        }
        return null;
    }
}


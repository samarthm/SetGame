
/**
 * Write a description of class TestZetTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestZetTable
{
    public static void main (String [] args)
    {
        ZetTable table = new ZetTable();
        int[] zet = new int[3];
        while (table.cardsInDeck() > 0){
            zet = table.findZet();
            while (zet == null){
                if (!table.open3Cards())
                    return;
                else
                    zet = table.findZet();
            }
            System.out.println(zet[0] + " " + zet[1] + " " + zet[2] + "\n");
            table.remove3Cards(zet);
            if (!table.enoughOpen())
                if (!table.open3Cards())
                    return;
        }
    }
}

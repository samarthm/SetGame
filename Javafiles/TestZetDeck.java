/**
 * Write a description of class TestZetDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestZetDeck
{
    public static void main(String[] args){
        
        ZetDeck deck1=new ZetDeck();
        for (int x=0; x<3; x++){
            System.out.println(deck1.takeTop());
        }
    }
}

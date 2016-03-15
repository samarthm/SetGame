
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card implements Comparable<Card>
{
    private int id;
    public Card(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    
    public boolean equals(Object other)
    {
        return this.compareTo((Card)(other))==0;
    }
    
    public int compareTo(Card other)
    {
        return this.id-other.getId();
    }
    
    public String toString()
    {
        return id + "";
    }
   
}

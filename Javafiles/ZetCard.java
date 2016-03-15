
/**
 * Write a description of class ZetCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZetCard extends Card
{
    private int n,s,f,c;
    public ZetCard (int number, int shape, int fill, int color)
    { 
        super(number*27+shape*9+fill*3+color);
        n=number;
        s=shape;
        f=fill;
        c=color;

    }

    public int getNumber()
    {
        return n;
    }

    public int getShape()
    {
        return s;
    }

    public int getFill()
    {
        return f;
    }

    public int getColor()
    {
        return c;
    }

    public String toString()
    {
        return "Number: " + n + ", Shape: " + s + ", Fill: " + f + ", Color: " + c;
    }
}
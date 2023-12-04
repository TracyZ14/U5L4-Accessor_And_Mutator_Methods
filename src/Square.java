public class Square
{
    private int side;

    public Square(int s)
    {
        side = s;
    }

    public String toString()
    {
        return "Side: " + side;
    }

    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        this.side = side;
    }
}
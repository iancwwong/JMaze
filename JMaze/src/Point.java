import java.awt.geom.Point2D;

/**
 * Represents integer (x,y) coordinates
 * @author ianwong
 *
 */
public class Point {
	public Point (int x, int y)
	{
        this.x = x;
        this.y = y;
	}
	
	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Point other = (Point)o;
		if (this.getX() == other.getX() && this.getY() == other.getY()) {
			return true;
		} else {
			return false;
		}
	}
	
    private int x;
    private int y;
}

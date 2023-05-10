public class Quadrilateral{

	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;

	public Quadrilateral(double x1, double y1,
						double x2, double y2,
						double x3, double y3,
						double x4, double y4)
	{
		point1 = new Point(x1,y1);
		point2 = new Point(x2,y2);
		point3 = new Point(x3,y3);
		point4 = new Point(x4,y4);
	}

	public Point getpoint1()
	{
		return point1;
	}
	public Point getpoint2()
	{
		return point2;
	}
	public Point getpoint3()
	{
		return point3;
	}
	public Point getpoint4()
	{
		return point4;
	}

	@Override
	public String toString()
	{
		return String.format("$s:\n%s", "Coordinates of Quadrilatereal are", getCoordinatesAsString());
	}

	public String getCoordinatesAsString()
	{
		return String.format("%s, %s, %s, %s", getpoint1(),getpoint2(),getpoint3(),getpoint4());
	}

	
}
public class RoomDimension
{
	double length;		// Room length
	double width;		// Room width
	
	public RoomDimension(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public String toString()
	{
		String output;
		output = "Room dimensions:\nLength: " + length +
				"\nWidth: " + width + "\nArea: " + getArea();
		return output;
	}
}
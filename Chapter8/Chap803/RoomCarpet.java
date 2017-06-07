public class RoomCarpet
{
	RoomDimension size;
	double carpetCost;
	
	public RoomCarpet(RoomDimension d, double cost)
	{
		size = new RoomDimension(d.getLength(), d.getWidth());
		carpetCost = cost;
	}
	
	public double getTotalCost()
	{
		return carpetCost;
	}
	
	public String toString()
	{
		String output = size + "\nCarpet cost: $" + carpetCost * 
						size.getArea();
		return output;
	}
}
public class Ship
{
	String ship;		// Ship name
	int year;			// Ship year
	
	// Constructor for name and year
	public Ship(String ship, int year)
	{
		this.ship = ship;
		this.year = year;
	}
	
	// Get the name of the ship
	public String getShipName()
	{
		return ship;
	}
	
	// Get the year of the ship
	public int getYear()
	{
		return year;
	}
	
	// toString method to display Ship Name and Build Year
	public String toString()
	{
		return "Ship Name: " + getShipName() +
				"\nBuild Year: " + getYear();
	}
}
public class CargoShip extends Ship
{
	int numTons;	// Capacity
	
	// Constructor for name, year, and numTons
	public CargoShip(String name, int year, int numTons)
	{
		super(name, year);
		this.numTons = numTons;
	}
	
	// Get the capacity of the Cargo Ship
	public int getNumTons()
	{
		return numTons;
	}
	
	// toString method tp display Ship Name and Capacity
	public String toString()
	{
		return "\n Ship name: " + getShipName() +
				"\nShip Capacity: " + getNumTons();
	}
}
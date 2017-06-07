import java.util.Scanner;		// Needed for the Scanner class

public class RoomTest
{
	public static void main(String[] args)
	{
		final double CARPET_PRICE = 8.0;	// Price per square foot
		double length;						// Room length
		double width;						// Room width
		RoomDimension dimensions;			// Holds room dimensions
		RoomCarpet room;					// Determines cost
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user for length of the room
		System.out.print("Enter the length of the room in feet: ");
		length = keyboard.nextDouble();
		
		// Prompt user for width of the room
		System.out.print("Enter the width of the room in feet: ");
		width = keyboard.nextDouble();
		
		// Create RoomDimension and RoomCarpet objects.
		dimensions = new RoomDimension(length, width);
		room = new RoomCarpet(dimensions, CARPET_PRICE);
		
		// Display dimensions and cost.
		System.out.println(room);
	}
}
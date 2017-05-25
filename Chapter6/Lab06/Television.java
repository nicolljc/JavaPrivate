public class Television
{
	private final String MANUFACTURER;	// Manufacturer of the TV
	private final int SCREEN_SIZE;		// Size of the TV
	private boolean powerOn;			// Power button
	private int channel;				// Channel button up/down
	private int volume;					// Volume button up/down
	
	// Constructor initializes Television class
	public Television(String man, int size)
	{
		MANUFACTURER = man;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	// Return the current volume
	public int getVolume()
	{
		return volume;
	}
	
	// Return the current channel
	public int getChannel()
	{
		return channel;
	}
	
	// Return the Manufacturer of the TV
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	// Return the screen size
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	// Set channel to given number
	public void setChannel(int ch)
	{
		channel = ch;
	}
	
	// Turn the TV on or off
	public void power()
	{
		powerOn = !powerOn;
	}
	
	// Increase volume by 1
	public void increaseVolume()
	{
		volume += 1;
	}
	
	// Decrease volume by 1
	public void decreaseVolume()
	{
		volume -= 1;
	}
}
import javax.swing.JOptionPane;	// Needed for the JOptionPane class

public class RunningTheRace
{
	public static void main(String[] args)
	{
		// Declare variables to store input
		String name1, name2, name3;
		String time1, time2, time3;
		
		// Declare time variables to convert input
		double t1, t2, t3;
		
		// Prompt for the runners' names
		name1 = JOptionPane.showInputDialog("Enter the first runner's name");
		name2 = JOptionPane.showInputDialog("Enter the second runner's name");
		name3 = JOptionPane.showInputDialog("Enter the third runner's name");
		
		// Prompt for the time each runner finished the race
		time1 = JOptionPane.showInputDialog("Enter the time runner 1 finished the race");
		time2 = JOptionPane.showInputDialog("Enter the time runner 2 finished the race");
		time3 = JOptionPane.showInputDialog("Enter the time runner 3 finished the race");
		
		// Convert to double
		t1 = Double.parseDouble(time1);
		t2 = Double.parseDouble(time2);
		t3 = Double.parseDouble(time3);
		
		// Order runners by their best time
		if(t1 < t2 && t1 < t3)
		{
			if(t2 < t3)
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name1 + 
						"\n2nd Place: " + name2 + "\n3rd Place: " + name3);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name1 +
						"\n2nd Place: " + name3 + "\n3rd Place: " + name2);
			}
		}
		else if(t2 < t1 && t2 < t3)
		{
			if(t1 < t3)
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name2 +
						"\n2nd Place: " + name1 + "\n3rd Place: " + name3);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name2 + 
						"\n2nd Place: " + name3 + "\n3rd Place: " + name1);
			}
		}
		else if(t3 < t2 && t3 < t1)
		{
			if(t2<t1)
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name3 + 
						"\n2nd Place: " + name2 + "\n3rd Place: " + name1);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "1st Place: " + name3 + 
						"\n2nd Place: " + name1 + "\n3rd Place: " + name2);
			}
		}
	}
}
import javax.swing.JOptionPane;		// Needed for JOptionPane

public class BarChart
{
	public static void main(String[] args)
	{
		int numberOfStores = 5;
		String input;				// To hold user input
		double sales;				// Store sales
		int divisions;				// Hundred dollar divisions
		String output = "SALES BAR CHART\n";
		
		for (int store = 1; store <= numberOfStores; store++)
		{
			input = JOptionPane.showInputDialog("Enter today's sales for store " + store);
			sales = Double.parseDouble(input);
			divisions = (int)(sales / 100);
			output += "Store " + store + ": ";
			for (int printAsterisk = 1; printAsterisk <= divisions; printAsterisk++)
			{
				output += "*";
			}
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	}
}
import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #4 HERE
      // Create a FileReader object passing it the filename
	  FileReader fw = new FileReader(filename);
	  
      // Create a BufferedReader object passing FileReader
      // object
	  BufferedReader br = new BufferedReader(fw);
	  
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
	  String tem = " ";
	  while ((tem = br.readLine()) != null)
	  {
		  // Convert the line to a double value and add the
		  // value to sum
		  sum = sum + Double.parseDouble(tem);
		  
		  // Increment the counter
		  count++;
		  // Read a new line from the file
	  }
	  
      // Close the input file
	  fw.close();
	  
      // Store the calculated mean
	  mean = sum / count;
	  
	  System.out.print("\nMEAN = " + mean);

      // ADD LINES FOR TASK #5 HERE
      // Reconnect FileReader object passing it the
      // filename
	  FileReader fr = new FileReader(filename);
	  
      // Reconnect BufferedReader object passing
      // FileReader object
	  BufferedReader brr = new BufferedReader(fr);
	  
      // Reinitialize the sum of the numbers
      // Reinitialize the number of numbers added
	  sum = 0; 
	  count = 0;
	  
      // Perform a priming read to read the first line of
      // the file
	  // Loop until you are at the end of the file
	  while ((tem = brr.readLine()) != null)
	  {
		  // Convert the line into a double value and
		  // subtract the mean
		  difference = mean - Double.parseDouble(tem);
		  
          // Add the square of the difference to the sum
		  sum = sum + Math.pow(difference, 2);
		  
          // Increment the counter
		  
		  count++;
          // Read a new line from the file
	  }
      // Close the input file
	  fr.close();
	  
      // Store the calculated standard deviation
	  stdDev = Math.sqrt(sum / count);
	  System.out.printf("\nStandard deviation: %.3f\n", stdDev);

      // ADD LINES FOR TASK #3 HERE
      // Create a FileWriter object using "Results.txt"
	  FileWriter f = new FileWriter("Results.txt");
	  
      // Create a PrintWriter object passing the
      // FileWriter object
	  PrintWriter pw = new PrintWriter(f);
	  
      // Print the results to the output file
	  line = String.format("%.3f", stdDev);;
	  pw.print(line);
	  pw.print("\n");
	  line = String.format("%.3f", mean);;
	  pw.print(line);
	  
      // Close the output file
	  pw.close();
   }
}
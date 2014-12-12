import java.io.*;

//Reads in output data from RunWord.jar and finds longest LCS between two books
//Usage: java OutputReader <name of book 1> <name of book 2>

public class OutputReader
{
	public static void main(String[] args) throws IOException
	{
		String longest = "";
		File inputFile = new File("b" + args[0] + "_c0_b" + args[1] + ".txt");
		int counter = 0;
		while (inputFile.exists())
		{
			BufferedReader input = new BufferedReader(new FileReader(inputFile));
			String s = input.readLine();
			if (longest.length() < s.length())
				longest = s;
			input.close();
			counter++;
			inputFile = new File("b" + args[0] + "_c" + counter + "_b" + args[1] + ".txt");
		}
		System.out.println("Number of files found: " + counter);
		System.out.println("Longest substring: " + longest);
	}
}

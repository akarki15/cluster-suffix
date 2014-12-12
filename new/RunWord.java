
/* Constructs Suffixtrees out of chapters 
 * Finds LCS using the suffixtree
 * */

import java.util.ArrayList;
import java.io.*;

public class RunWord
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Starting job.");
		BookReaderWord brw1 = new BookReaderWord("book" + args[0] + ".txt");
		System.out.println("Read in book 1.");
		QuadSuffixWord qsw = new QuadSuffixWord(brw1.chapterList(Integer.parseInt(args[1])));
		System.out.println("Created tree of chapter.");
		BookReaderWord brw2 = new BookReaderWord("book" + args[2] + ".txt");
		System.out.println("Read in book 2.");
		String bestLCS = "";
		for (ArrayList<String> chapter : brw2.book)
		{
			String LCS = qsw.LCS(chapter);
			if (bestLCS.length() < LCS.length())
			{
				bestLCS = LCS;
			}
		}
		System.out.println("Found best LCS.");
		System.out.println(bestLCS);
		PrintWriter output = new PrintWriter(new File("output/b" + args[0] + "_c" + args[1] + "_b" + args[2] + ".txt"));
		output.println(bestLCS);
		output.close();
	}
}

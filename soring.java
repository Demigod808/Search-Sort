import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class Sorting 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{
		ArrayList <String> namesList = new ArrayList<>();
		System.out.printf("Please enter name of file to sort: ");
		String inputFileName=keyboard.next();
		
		File inputFile = new File(inputFileName); 
		
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFileName);
			System.exit(0);
		}
		
		
		
		
		Scanner inputReader = new Scanner(inputFile);
		System.out.printf("Please enter name of file to write sorted lists to to: ");
		String outputFileName=keyboard.next();
		File outputFile = new File (outputFileName); 
		PrintWriter outputWriter = new PrintWriter(outputFile);
		//need to close output writer
		
		
		
		while (inputReader.hasNext())
		{
			namesList.add(inputReader.next());				
		}

		
		
		
		
		Collections.sort(namesList);
		Iterator<String> iterOnNamesAscending = namesList.iterator();
		outputWriter.printf("Ascending List\n");
		
		 while (iterOnNamesAscending.hasNext() )
			outputWriter.printf("%s\n", iterOnNamesAscending.next());
		Collections.reverse(namesList);
		Iterator<String> iterOnNamesDescending = namesList.iterator();
		outputWriter.printf("\nDescending List\n");
		while (iterOnNamesDescending.hasNext() )
			outputWriter.printf("%s\n", iterOnNamesDescending.next());
		outputWriter.printf("\nFirst alphabetized element is %s\n", Collections.min(namesList));
		outputWriter.printf("\nLast alphabetized element is %s\n", Collections.max(namesList));		
	
	}
}

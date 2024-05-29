import java.util.*;
import java.io.*;

class  WordCheck 
{
	public static void main(String[] args) 
	{
		Set<String> dictionaryWords = readWords ("Words.txt");
		Set<String> documentWords = readWords("test.txt");

		for (String word : documentWords )
		{
			if (!dictionaryWords.contains(word))
			{
				System.out.println(word);
			}
		}
	}

		public static Set<String> readWords(String filename) throws FileNotFoundException
		{
			Set<String> words = new HashSet<String> ();
			Scanner in = new Scanner (new File(filename));

			in.useDelimiter("[^a-zA-Z]+");
			while (in.hasNext())
				words.add(in.next().toLowerCase());
			return words;
		}
	}

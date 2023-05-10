import java.util.*;
import java.util.regex.Pattern;

public class Duplicate {
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("\\s+");
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a sentence:");

		String userInput = input.nextLine();
		pattern.splitAsStream(userInput)
			   .map(String::toLowerCase)
			   .map(s -> s.replaceAll("(?!')\\p{P}",""))
			   .distinct()
			   .sorted()
			   .forEach(System.out::println);
	}
}
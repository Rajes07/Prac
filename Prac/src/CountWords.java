import java.util.Scanner;

public class CountWords {
	    public static int countWords(String str)
	    {
	        if (str == null || str.isEmpty())
	            return 0;

	        String[] words = str.split("\\s+");
	        return words.length;
	    }
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	        String str =sc.nextLine();

	        System.out.println("No of words : " +
	           countWords(str));
	    }
	}

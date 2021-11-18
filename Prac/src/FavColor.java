import java.util.Scanner;

public class FavColor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your fav color");
		String str1=sc.next();
		System.out.println("Enter another fav color");
		String str2=sc.next();
		
		String str3="Red";
		Boolean str4=str1.startsWith(str3);
		Boolean str5=str2.startsWith(str3);

			System.out.println("Red is "+str4.booleanValue());
			System.out.println("Orange is"+str5.booleanValue());
	
			
	}
}

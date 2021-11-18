import java.util.Scanner;

public class Lexicography {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter str1");
		 String str1= sc.next();
		System.out.println("Enter str2");
		String str2=sc.next();
		int str1length=str1.length();
	
		int str2length=str2.length();
		if(str1length==str2length) {
			System.out.println("String 1 is equal to string 2");
		}else if(str1length>str2length) {
			System.out.println(str1+" is greater than"+str2);
		}else {
			System.out.println(str1+" is lesser tham "+str2);
		}
		 
	}
}

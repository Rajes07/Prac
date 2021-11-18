import java.util.Scanner;

public class StringtoInteger {
	public static void main(String[] args) {
		System.out.println("Enter a num as string to convert into int");
	Scanner sc= new Scanner(System.in);
	String str1=sc.next();
	int i=Integer.parseInt(str1);
	System.out.println(i);
	

}
}

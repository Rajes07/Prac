import java.util.Scanner;

public class Uppercase {
public static void main(String[] args) {
	System.out.println("Enter line of words");
	Scanner sc= new Scanner(System.in);
	String str1= sc.next();
	if(str1.equals(str1.toUpperCase())) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
}
}

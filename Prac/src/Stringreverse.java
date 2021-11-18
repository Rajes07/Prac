import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		System.out.println("Enter line to reverse");
		Scanner sc= new Scanner(System.in);
		String str1=sc.nextLine();
		StringBuffer sb= new StringBuffer(str1);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}

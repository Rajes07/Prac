import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String args[]) {
        String str;
        int i, counter[] = new int[256];
 Map<String,Integer> map=new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
 
        
        for (i = 0; i < str.length(); i++) {
        	if(map.containsKey(String.valueOf(str.charAt(i)))){
        		int key=map.get(String.valueOf(str.charAt(i)));
        		map.put(String.valueOf(str.charAt(i)),++key );
        	}else {
        		map.put(String.valueOf(str.charAt(i)),1 );
        	}
            
        }
       
        System.out.println(map);
    }
}
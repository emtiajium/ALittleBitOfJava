import java.util.Scanner;

public class StringInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		String stringOne, stringTwo;
		
		System.out.println("Enter string with space");
		stringOne = myInput.nextLine();
		System.out.printf("%s\n",stringOne);
		
		System.out.println("Enter string without space");
		stringTwo = myInput.next();
		System.out.println(stringTwo);
	}
}

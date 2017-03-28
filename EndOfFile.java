import java.util.Scanner;

public class EndOfFile {
	public static void main(String cLA[]) {
		
		Scanner input = new Scanner(System.in);
		
		int aNumber, anotherNumber;
		
		while(input.hasNextInt()) {
			aNumber = input.nextInt();
			anotherNumber = input.nextInt();
		}
	}
}

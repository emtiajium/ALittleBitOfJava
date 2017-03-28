import java.util.Scanner;

public class CharacterInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		char myCharacter = myInput.next().charAt(0);
		
		System.out.printf("%c\n", myCharacter);
		System.out.println(myCharacter);
	}
}

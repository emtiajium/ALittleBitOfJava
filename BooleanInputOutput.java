import java.util.Scanner;

public class BooleanInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		boolean myBool = myInput.nextBoolean(); // true or false
		
		System.out.printf("%b\n", myBool);
	}
}

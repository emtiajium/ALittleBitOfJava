import java.util.Scanner;

public class LongInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		long firstNumber, secondNumber, summation;

		firstNumber = myInput.nextLong();
		secondNumber = myInput.nextLong();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%d\n", summation);
		System.out.printf(summation + "\n");
	}
}

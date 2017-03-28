import java.util.Scanner;

public class IntegerInputOutput {
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int firstNumber, secondNumber, summation;
		
		firstNumber = myInput.nextInt();
		secondNumber = myInput.nextInt();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%d\n",summation);
		System.out.println(summation);
	}
}

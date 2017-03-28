import java.util.Scanner;

public class DoubleInputOutput {
	
	public static void main(String cLA[]) {

		Scanner myInput = new Scanner(System.in);

		double firstNumber, secondNumber, summation;

		firstNumber = myInput.nextDouble();
		secondNumber = myInput.nextDouble();
		
		summation = firstNumber + secondNumber;
		
		System.out.printf("%.2f\n", summation);
		System.out.println(summation);
	}
}

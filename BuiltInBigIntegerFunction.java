import java.util.Scanner;
import java.math.BigInteger;

public class BuiltInBigIntegerFunction {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);

		BigInteger aBigNumber = myInput.nextBigInteger();
		BigInteger anotherBigNumber = myInput.nextBigInteger();

		BigInteger summation = aBigNumber.add(anotherBigNumber);
		BigInteger subtraction = aBigNumber.subtract(anotherBigNumber);
		BigInteger multiplication = aBigNumber.multiply(anotherBigNumber);
		BigInteger division = aBigNumber.divide(anotherBigNumber);
		BigInteger remainder = aBigNumber.mod(anotherBigNumber);
		BigInteger gcd = aBigNumber.gcd(anotherBigNumber);

		System.out.printf("Summation %d\n", summation);
		System.out.printf("Subtraction %d\n", subtraction);
		System.out.printf("Multiplication %d\n", multiplication);
		System.out.printf("Division %d\n", division);
		System.out.printf("Modulus %d\n", remainder);
		System.out.printf("GCD %d\n", gcd);
	}
}

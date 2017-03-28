import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerInputOutput {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		BigInteger aBigNumber = myInput.nextBigInteger();
		System.out.printf("%d\n", aBigNumber);
	}
}

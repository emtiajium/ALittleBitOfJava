import java.util.Scanner;
import java.math.BigInteger;
// Another Header file

public class LoveWithBigInteger {
	
	public static void main(String cLA[]) {
		
		BigInteger aBigNumber;
		
		aBigNumber = BigInteger.valueOf(5); // within integer range
		System.out.printf("%d\n", aBigNumber);
		
		aBigNumber = new BigInteger("1234");
		System.out.println(aBigNumber);
	}
}

import java.util.Scanner;

public class KiddingWithWhile {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int howManyTimes = myInput.nextInt();
		
		while(howManyTimes-- > 0) {
			System.out.println("Do something");
		}
	}
}

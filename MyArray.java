import java.util.Scanner;

public class MyArray {
	
	public static void main(String cLA[]) {
		
		Scanner myInput = new Scanner(System.in);
		
		int arr[] = new int[101];
		
		int arraySize = myInput.nextInt();
		
		for(int i = 0; i < arraySize; i++) {
			arr[i] = myInput.nextInt();
			System.out.printf("%d ", arr[i]);
		}
	}
}

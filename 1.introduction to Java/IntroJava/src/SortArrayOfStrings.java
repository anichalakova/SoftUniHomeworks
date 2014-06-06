import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		System.out.println("Enter the number of strings you wish to sort and the strings themselves:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] inputStrings = new String[n];
		input.nextLine();
		for (int i = 0; i < inputStrings.length; i++) {
			inputStrings[i] = input.nextLine();
		}
		Arrays.sort(inputStrings);
		for (String each : inputStrings) {
			System.out.println(each);
		}	
	}
}

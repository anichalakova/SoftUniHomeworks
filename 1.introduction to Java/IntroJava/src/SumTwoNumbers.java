import java.util.Scanner;

public class SumTwoNumbers {
	public static void main(String[] args) {
		System.out.println("Enter two integer numbers:");
		Scanner input = new java.util.Scanner(System.in);
		int a;
		int b;
		a = input.nextInt();
		b = input.nextInt();
		int sum = a + b;
		System.out.println("Sum of the numbers is " +  sum);		
	}	
}

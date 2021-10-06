package Conditional_Exercise_P1;
import java.util.Scanner;

public class Exercise_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		String result = (number > 0) ?  "Number is positive" : "Number is negative";
		result = (number == 0) ? "Number equal than zero" : result;
		System.out.print(result);
	}
}
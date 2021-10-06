package Conditional_Exercise_P1;
import java.util.Scanner;

public class Exercise_5 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your two numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		number1 = Math.round(number1*1000)/1000.0;
		number2 = Math.round(number2*1000)/1000.0;
		String result = (number1 == number2) ? "They are equal" : "They are different";
	    System.out.println(result);
		
	}
}

package Conditional_Exercise_P1;
import java.util.Scanner;

public class Exercise_2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your three numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int max = (number1 > number2) ? number1 : number2;
		max = (max > number3) ? max : number3;
		System.out.println("Greatest number is: "+ max);
	}
}
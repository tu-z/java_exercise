package Conditional_Exercise_P2;
import java.util.Scanner;

public class Exercise_4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 number: ");
		double number1 = input.nextInt();
		double number2 = input.nextInt();
		double number3 = input.nextInt();
		double number4 = input.nextInt();
		double number5 = input.nextInt();
		double sum = number1 + number2 + number3 + number4 + number5; 
		double avg = sum / 5.0;
		System.out.print("sum: "+ sum+", avg: "+avg);
	}
}
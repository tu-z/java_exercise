package Conditional_Exercise_P1;
import java.util.Scanner;

public class Exercise_4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = input.nextInt();
		number = (number < 0) ? number*(-1) : number; 
		number = number % 7;
		switch (number) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
				
		}
		
	}
}
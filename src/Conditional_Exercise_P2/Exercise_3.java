package Conditional_Exercise_P2;
import java.util.Scanner;

public class Exercise_3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		String result = (year % 4 == 0)? " is a leap year" : " is not leap year";
		System.out.print(year+result);
	}
}
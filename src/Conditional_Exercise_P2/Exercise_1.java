package Conditional_Exercise_P2;
import java.util.Scanner;

public class Exercise_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month, year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		int days = (month == 4 || month == 6 || month == 9 || month == 11)? 30 : 31;
		days = (month == 2) ? 28 : days;
		days = (month == 2 && year % 4 ==0)? 29 : days;
		System.out.print(days+" days");
	}
}
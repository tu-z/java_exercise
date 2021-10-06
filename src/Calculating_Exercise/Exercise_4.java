package Calculating_Exercise;
import java.util.Scanner;

public class Exercise_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		int year = minutes / 525600;
		int day = (minutes % 525600) / 1440;
		System.out.println("year: "+ year + ", day: "+day);
	}
	
}

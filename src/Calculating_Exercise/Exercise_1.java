package Calculating_Exercise;
import java.util.*;

public class Exercise_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter fahrenheit");
		double f = input.nextDouble();
		double c =5.0 / 9.0 * (f - 32);
		System.out.print(c+"C");
		
	}
}

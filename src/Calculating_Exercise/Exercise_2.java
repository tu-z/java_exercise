package Calculating_Exercise;
import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter inch value");
		double inch = input.nextDouble();
		double m =inch * 0.0254;
		System.out.print(m+"m");
	}
}

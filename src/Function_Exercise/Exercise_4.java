package Function_Exercise;
import java.util.Scanner;

public class Exercise_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ax + b = 0");
		int a;
		do {
			System.out.print("enter a (a <> 0) : ");
			a = input.nextInt();
		}while(a == 0);
		System.out.print("enter b: ");
		int b =input.nextInt();
		firstDegreeEquation(a , b);
	}
	
	public static void firstDegreeEquation(int a, int b) {
		System.out.print(-b/a);
	}
}
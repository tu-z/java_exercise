package Loop_P1;
import java.util.Scanner;
public class bt8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		int factorial = 1;
		for(int i = 1; i <= x; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
		
	}
	
}

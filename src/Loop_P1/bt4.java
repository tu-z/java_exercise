package Loop_P1;
import java.util.Scanner;
public class bt4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		int sum = 0;
		do {
			int tmp = x % 10;
			sum += tmp;
			x /= 10;
		} while(x>0);
		System.out.println(sum);
		
	}
	
}

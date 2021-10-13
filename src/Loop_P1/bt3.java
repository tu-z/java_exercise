package Loop_P1;
import java.util.Scanner;
public class bt3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		do {
			x = input.nextInt();
		}
		while(x <= 0);
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum+=i;
		}
		System.out.println(sum);
	
	}
	
}

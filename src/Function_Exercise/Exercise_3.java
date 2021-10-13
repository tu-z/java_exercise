package Function_Exercise;
import java.util.Scanner;

public class Exercise_3 {
	
	static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			n = input.nextInt();
		}
		while(n <= 0);
		String s = input.next();
		loop(n , s);
	}
	
	static void output(String s) {
		System.out.print(s);
	}
	static void loop(int n , String s){
		for(int i = 0; i < n; i++) {
			output(s);
		}
	}
}
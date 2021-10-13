package Function_Exercise;
import java.util.Scanner;

public class Exercise_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			n = input.nextInt();
		}
		while(n <= 0);
		String s = input.next();
		loop(n , s);
	}
	
	public static void output(String s) {
		System.out.println(s);
	}
	public static void loop(int n , String s){
		for(int i = 0; i < n; i++) {
			output(s);
		}
	}
}
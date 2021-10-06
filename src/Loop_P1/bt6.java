package Loop_P1;
import java.util.Scanner;
public class bt6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int Prime = 0;
		for(int i = x; i <= y; i++) {
			if(i >= 2) {
				if(Pre(i)) {
					Prime++;
				}
			}
		}
		System.out.println(Prime);
		
	}
	public static boolean Pre(int x) {
		if(x >= 2) {
			for(int i = 2; i < x; i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
}

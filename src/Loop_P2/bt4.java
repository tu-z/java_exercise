package Loop_P2;

import java.util.Scanner;

public class bt4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		for(int i = 1; i <= x; i++) {
			if(Pre(i)) {
				System.out.print(i + " ");				
			}
		}
		
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

package Loop_P2;

import java.util.Scanner;

public class bt6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 10000; i <= 99999; i++) {
			if(Pre(i)) {
				System.out.println(i);				
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

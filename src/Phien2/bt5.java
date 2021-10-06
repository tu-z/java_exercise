package Phien2;

import java.util.Scanner;

public class bt5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		int i=0, k=2;
		while(x >i) {
			if(Pre(k)) {
				System.out.print(k+" ");
				i++;
			}
			k++;
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

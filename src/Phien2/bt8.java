package Phien2;

import java.util.Scanner;

public abstract class bt8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		int i = 0;
		while(true) {
			int j = fibonacci(i);
			if(j > x) {
				break;
			}
			if(Pre(j)) {
				System.out.print(j+ " ");
			}
			i++;
		}
		
	}
	public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
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

package Phien1;
import java.util.Scanner;
public class bt9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		x = (x<0) ? x*(-1) : x;
		int reserve = 0;
		while(x > 0) {
			int temp = x % 10;
			reserve = reserve*10 + temp;
			x/=10;
		}
		System.out.println(reserve);
		
	}
	
}

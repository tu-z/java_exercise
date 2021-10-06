package Phien2;
import java.util.Scanner;
public class bt1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=10; i<=200; i+=1) {
			if(i%7==0 && i%5!=0) {
				System.out.print(i+" ");
			}
		}		
	}
}
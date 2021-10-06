package Logic_BrankchingStructure;

import java.util.Scanner;
import java.lang.Math;
public class Exercise_1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int a = (int)(Math.random() * 30) + 0;
		int b = (int)(Math.random() * 30) + a;
		int c = b - a;
		System.out.println("ket qua cua phep toan " + b + "-" + a +" la gi:");
		System.out.println("nhap dap an cua ban  ");
		int x = input.nextInt(); 
		
		if(x==c) {
			System.out.println("ban da tra loi dung");
		}
		else {
			System.out.println("rat tiet ban da tra loi sai");
		}
	}
}
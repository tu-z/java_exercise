package Conditional_Exercise_P2;
import java.util.Scanner;

public class Exercise_2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your character: ");
		String s =input.next();
		String result =  "error";
		s =s.toUpperCase();
		char z = s.charAt(0);
		if(z >= 'A' && z <= 'Z') {
			result = (z == 'U' || z == 'O' || z == 'E' || z == 'A' || z =='I') ? "Generator" : "Consonant" ;
		}
		System.out.println(result);
	}
}
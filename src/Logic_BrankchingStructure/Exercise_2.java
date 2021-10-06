package Logic_BrankchingStructure;
import java.util.Scanner;

public class Exercise_2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("nhap tuoi cua ban  ");
		int age = input.nextInt();
		if(age < 16) {
			System.out.println("ban chua du tuoi de xac dinh IBM");
		}
		else {
			System.out.println("nhap chi so IBM cua ban  ");
			double x = input.nextDouble(); 
			if(x<18.5) {
				System.out.println("Underweight");
			}
			else if(x>=18.5 && x<25.5){
				System.out.println("Normal");
			}
			else if(x>=25.5 && x<30.0){
				System.out.println("Overweight");
			}
			else {
				System.out.println("Obese");
			}			
		}
	}
}
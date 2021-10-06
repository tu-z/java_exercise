package Logic_BrankchingStructure;
import java.util.Scanner;

public class Exercise_3 {
	public static void main (String[] args) {
		final int SINGLE =1 ,MARRIED = 2, SEPARATED = 3,  HOUSEHOLD = 4; 
		Scanner input = new Scanner(System.in);
		System.out.println("enter your salary");
		int x = input.nextInt(); 
		System.out.println("select options");
		System.out.println("enter 1: single");
		System.out.println("enter 2: married filing jointly or qualifying widow (er)");
		System.out.println("enter 3: married filing separately" );
		System.out.println("enter 4: head of household");
		int status = input.nextInt();
		double taxes = 0;
		if(status == SINGLE) {
			if(x >= 0 && x <= 8350) {
				taxes = x*0.1;
			}
			else if(x >= 8351 && x <= 33950) {
				taxes = x*0.15;
			}
			else if(x >= 33951 && x <= 82250) {
				taxes = x*0.25;
			}
			else if(x >= 82251 && x <= 171550) {
				taxes = x*0.28;
			}
			else if(x >= 171551 && x <= 372950) {
				taxes = x*0.33;
			}
			else if(x >= 372951 ) {
				taxes = x*0.25;
			}
			
		}
		else if(status == MARRIED) {
			if(x >= 0 && x <= 16700) {
				taxes = x*0.1;
			}
			else if(x >= 16701 && x <= 67900) {
				taxes = x*0.15;
			}
			else if(x >= 67901 && x <= 137050) {
				taxes = x*0.25;
			}
			else if(x >= 137051 && x <= 208850) {
				taxes = x*0.28;
			}
			else if(x >= 208851 && x <= 372950) {
				taxes = x*0.33;
			}
			else if(x >= 372951 ) {
				taxes = x*0.25;
			}
		}
		else if(status == SEPARATED) {
			if(x >= 0 && x <= 8350) {
				taxes = x*0.1;
			}
			else if(x >= 8351 && x <= 33950) {
				taxes = x*0.15;
			}
			else if(x >= 33951 && x <= 82250) {
				taxes = x*0.25;
			}
			else if(x >= 82251 && x <= 171550) {
				taxes = x*0.28;
			}
			else if(x >= 171551 && x <= 372950) {
				taxes = x*0.33;
			}
			else if(x >= 372951 ) {
				taxes = x*0.25;
			}
		}
		else if(status == HOUSEHOLD) {
			if(x >= 0 && x <= 8350) {
				taxes = x*0.1;
			}
			else if(x >= 8351 && x <= 33950) {
				taxes = x*0.15;
			}
			else if(x >= 33951 && x <= 82250) {
				taxes = x*0.25;
			}
			else if(x >= 82251 && x <= 171550) {
				taxes = x*0.28;
			}
			else if(x >= 171551 && x <= 372950) {
				taxes = x*0.33;
			}
			else if(x >= 372951 ) {
				taxes = x*0.25;
			}
		}
		else {
			System.out.println("error your option");
		}
		System.out.println("your taxes " + taxes + " $");
	}
}
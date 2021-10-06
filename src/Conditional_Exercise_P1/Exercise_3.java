package Conditional_Exercise_P1;

import java.util.Scanner;

public class Exercise_3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		double number = input.nextDouble();
		String result = "";
		if(number > -1 && number < 1) {
			result = (number > 0)? "small positive" : "small negative";
			result = (number == 0)? "zero" : result;
		}
		else if(number >= -1000000 && number <= 1000000){
			result = (number > 0)? " positive" : "negative";
		}
		else {
			result = (number > 0)? "large positive" : "large negative";
		}
		System.out.println(result);
	}
}
package Calculating_Exercise;
import java.util.Scanner;

public class Exercise_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter hour value, minutes value, seconds value: ");
		int hour = input.nextInt();
		int minutes = input.nextInt();
		int	seconds = input.nextInt();
		int time = hour * 3600 + minutes * 60 + seconds;
		System.out.print("enter distance value (meters): ");
		int m = input.nextInt();
		double ms = (double)m/time;
		System.out.println(ms + "m/s, "+ ms*3.6 + "km/h, "+ ms*2.237415 +" dam/h");
	}
	
}

package Array;
import java.util.*;
import java.math.*;
public class Exercise_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array_a = createArray(n);
		double[] array_b = createDoubleArray(n);
		output1(array_a);
		System.out.println();
		output2(array_b);
		System.out.println("\navg : " + avg(array_a , array_b));
		
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 99) + 1;
			array[i] = z;
		}
		return array;
	}
	public static double[] createDoubleArray(int n){
		double[] array = new double[n];
		for(int i = 0; i< n; i++) {
			double z = (Math.random() * 1);
			array[i] = z;
		}
		return array;
	}
	
	public static double avg(int[] array_a, double[] array_b) {
		double sum = 0;
		for(int i = 0; i < array_a.length; i++) {
			sum += array_a[i] * array_b[i];
		}
		return sum / (array_a.length);
	}
	public static void output1(int [] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	public static void output2(double[] array) {
		for(double i : array) {
			System.out.print(i + " ");
		}
	}
	
}

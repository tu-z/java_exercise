package Array;
import java.util.*;
import java.math.*;
public class Exercise_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = createArray(n);
		output(numbers);
		System.out.println("\navg : " + avg(numbers));
		
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 99) + 1;
			array[i] = z;
		}
		return array;
	}
	
	public static int avg(int[] array) {
		int sum = 0;
		int length = array.length;
		for(int i : array) {
			sum += i;
		}
		return sum / length;
	}
	public static void output(int [] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
}

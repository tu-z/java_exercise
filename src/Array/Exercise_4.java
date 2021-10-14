package Array;
import java.util.*;
import java.math.*;
public class Exercise_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = createArray(n);
		output(numbers);
		System.out.println();
		output_reverse(numbers);		
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 99) + 1;
			array[i] = z;
		}
		return array;
	}
	
	public static void output(int [] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public static void output_reverse(int [] array) {
		int length = array.length - 1;
		for(int i = length; i >= 0; i = i -1) {
			System.out.print(array[i] + " ");
		}
	}
	
}

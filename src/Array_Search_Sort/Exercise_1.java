package Array_Search_Sort;
import java.util.*;
import java.math.*;
public class Exercise_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter array length: ");
		int n = input.nextInt();
		System.out.println("enter your value:");
		int N = input.nextInt();
		int[] numbers = createArray(n);
		output(numbers);
		System.out.println("\nindex : " + findValue(numbers, N));
		
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 99) + 1;
			array[i] = z;
		}
		return array;
	}
	
	public static int findValue(int[] array, int value) {
		int index = -1;
		int length = array.length;
		for(int i = 0; i < length; i++) 
	         if(array[i] == value) {
	        	 index = i;
	        	 break;
	         }
		return index;
	}
	public static void output(int [] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}

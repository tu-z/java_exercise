package Array_Search_Sort;
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Exercise_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter array length: ");
		int n = input.nextInt();
		System.out.println("enter your value:");
		int N = input.nextInt();
		int[] numbers = createArray(n);
		Stack <Integer> arr = findValue(numbers, N);
		output(numbers);
		outputStack(arr);
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 10) + 1;
			array[i] = z;
		}
		return array;
	}
	
	public static Stack <Integer> findValue(int[] array, int value) {
		Stack <Integer> arr = new Stack<Integer>();
		int length = array.length;
		for(int i = 0; i < length; i++) {
	         if(array[i] == value) {
	        	arr.push(i);
	         }
		}
		return arr;
	}
	
	public static void outputStack(Stack <Integer> array) {
		if(array.size() == 0) {
			System.out.print( "\n[]");
		}
		else {
			System.out.println("\nindex: ");
			for(int i : array) {
				System.out.print(i + ", ");
			}			
		}
	}
	
	public static void output(int [] array) {
		System.out.println();
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}

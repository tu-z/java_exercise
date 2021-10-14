package Array_Search_Sort;
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Exercise_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter array length: ");
		int n = input.nextInt();
		System.out.println("enter your value:");
		int N = input.nextInt();
		int[] numbers = createArray(n);
		output(numbers);
		System.out.println();
		System.out.println("first value (index) : " + findFirstValue(numbers, N));
		System.out.println();
		Stack <Integer> stack = findValue(numbers, N);
		outputStack(stack);
		numbers = array_sort_increase(numbers);
		output(numbers);
		numbers = array_sort_decrease(numbers);
		output(numbers);
	}
	
	public static int[] createArray(int n){
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = (int)(Math.random() * 10) + 1;
			array[i] = z;
		}
		return array;
	}
	
	public static int[] array_sort_decrease(int[] array) {
		int length = array.length;
		for(int i = 0; i < length - 1 ; i++){
	        for(int j = i + 1; j < length; j++){
	            if(array[i] < array[j]){
	                int temp  = array[i];
	                array[i] = array[j];
	                array[j] = temp;        
	            }
	        }
	    }
		return array;
	}
	public static int[] array_sort_increase(int[] array) {
		int length = array.length;
		for(int i = 0; i < length - 1 ; i++){
	        for(int j = i + 1; j < length; j++){
	            if(array[i] > array[j]){
	                int temp  = array[i];
	                array[i] = array[j];
	                array[j] = temp;        
	            }
	        }
	    }
		return array;
	}
	
	public static int findFirstValue(int[] array, int value) {
		int index = -1;
		int length = array.length;
		for(int i = 0; i < length; i++) 
	         if(array[i] == value) {
	        	 index = i;
	        	 break;
	         }
		return index;
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
	
	public static void output(int [] array) {
		System.out.println();
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void outputStack(Stack <Integer> array) {
		if(array.size() == 0) {
			System.out.print( "[]");
			System.out.println();
		}
		else {
			System.out.print("index: ");
			for(int i : array) {
				System.out.print(i + ", ");
			}			
			System.out.println();
		}
	}
}

package Array_Search_Sort;
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Exercise_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter array length: ");
		int n = input.nextInt();
		int[] numbers = createArray(n);
		output(numbers);
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
	
	
	
	public static void output(int [] array) {
		System.out.println();
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}

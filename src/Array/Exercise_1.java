package Array;
import java.util.*;
public class Exercise_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = createArray(n);
		System.out.print("avg : " + avg(numbers));
		
	}
	
	public static int[] createArray(int n){
		Scanner input = new Scanner(System.in);
		int[] array = new int[n];
		for(int i = 0; i< n; i++) {
			int z = input.nextInt();
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
//	public static void output(int [] array) {
//		for(int i : array) {
//			System.out.println(i + " ");
//		}
//	}
	
}

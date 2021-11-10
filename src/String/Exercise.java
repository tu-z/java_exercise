package String;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("nhap chuoi");
		String s = input.nextLine();
		s =s.replaceAll(" ", "");
		System.out.println();
		System.out.println(s);
		
		System.out.println("nhap chuoi");
		s = input.nextLine();
		s =s.toUpperCase();
		System.out.println();
		System.out.println(s);
		
		System.out.println("nhap chuoi");
		s = input.nextLine();
		String[] arr  = s.split(" ");
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("nhap chuoi");
		s = input.nextLine();
		System.out.println("nhap ky tu");
		String s1 = input.nextLine();
		char c = s1.charAt(0);
		int totalCharacters = 0;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == c)
                totalCharacters++;
        }
		System.out.println();
		System.out.println(totalCharacters);
		
		
		System.out.println("nhap chuoi");
		s = input.nextLine();
		System.out.println();
		for(int i = s.length() - 1 ; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		
	}
	
}
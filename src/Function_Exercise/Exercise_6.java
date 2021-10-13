package Function_Exercise;
import java.util.Scanner;

public class Exercise_6 {
	
	static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("enter your option (1 or 2):");
			n = input.nextInt();
		}while(n != 1 || n!= 2);
		int a = 0,b = 0,c = 0;
		if(n==1) {
			input1(a, b);
			firstDegreeEquation(a, b);
		}
		else{
			input2(a, b, c);
			SecondDegreeEquation(a, b ,c);
		}
		
		
	}
	
	static void output(String s) {
		System.out.print(s);
	}
	
	static void input1(int a, int b) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("enter a (a <> 0) : ");
			a = (int) input.nextDouble();
		}while(a == 0);
		System.out.print("enter b: ");
		b =(int) input.nextDouble();
	}
	
	static void input2(int a, int b, int c) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("enter a (a <> 0) : ");
			a = (int) input.nextDouble();
		}while(a == 0);
		System.out.print("enter b: ");
		b =(int) input.nextDouble();
		System.out.print("enter c: ");
		c =(int) input.nextDouble();
	}
	
	static void firstDegreeEquation(int a, int b) {
		System.out.print(-b/a);
	}
	public static void SecondDegreeEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
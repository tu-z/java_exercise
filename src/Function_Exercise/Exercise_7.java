package Function_Exercise;
import java.util.Scanner;

public class Exercise_7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your option (1 or 2):");
		int n = input.nextInt();	
		double a, b, c ;
		do {
			System.out.print("enter a (a <> 0) : ");
			a = input.nextDouble();
		}while(a == 0);
		
		System.out.print("enter b: ");
		b = input.nextDouble();
		
		if(n==2) {
			System.out.print("enter c: ");
			c = input.nextInt();
			SecondDegreeEquation(a, b, c);
		}
		else if(n==1) {
			firstDegreeEquation(a,b);
		}
		System.out.println("\n again (1 or 0)");
		int again = input.nextInt();
		if(again == 1) {
			System.out.print("enter your option (1 or 2):");
			do {
				System.out.print("enter a (a <> 0) : ");
				a = input.nextDouble();
			}while(a == 0);
			
			System.out.print("enter b: ");
			b = input.nextDouble();
			
			if(n==2) {
				System.out.print("enter c: ");
				c = input.nextInt();
				SecondDegreeEquation(a, b, c);
			}
			else if(n==1) {
				firstDegreeEquation(a,b);
			}
		}
		
		
	}
	
	
	public static void firstDegreeEquation(double a, double b) {
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
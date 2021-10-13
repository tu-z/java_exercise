package Function_Exercise;
import java.util.Scanner;

public class Exercise_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ax2 + bc + c = 0");
		double a;
		do {
			System.out.print("enter a (a <> 0) : ");
			a = input.nextDouble();
		}while(a == 0);
		System.out.print("enter b: ");
		double b =input.nextDouble();
		System.out.print("enter c: ");
		double c =input.nextDouble();
		giaiPTBac2(a , b , c);
	}
	
	public static void giaiPTBac2(double a, double b, double c) {
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
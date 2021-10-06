package Loop_P1;

public class bt2 {
	public static void main(String[] args) {
		int k = 5;
		for(int i = 0; i < 5; i++) {
			for(int j = k ; j >=1 ; j--) {
				System.out.print(j+"  ");
			}
			System.out.println();
			k--;
		}

	}
}

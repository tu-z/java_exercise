package Read_Write_File;
import java.util.Scanner;
import java.io.*;

public class Read_Write_File {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			String s = input.nextLine();
			FileOutputStream fos = new FileOutputStream("f:/file/mydata.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			FileInputStream fis = new FileInputStream("f:/file/mydata.txt");
			DataInputStream dis = new DataInputStream(fis);
			dos.writeChars(s);
			fos.close();
			dos.close();
			System.out.println("Done!");
			String data = dis.readLine(); 
			System.out.println(data);
		  	}catch (IOException ex) {
		  		ex.printStackTrace();
		  	} 
	}
}

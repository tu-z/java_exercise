package Read_Write_File;
import java.util.*;
import java.io.Serializable;
import java.io.*;
class Car implements Serializable {
	  String Name;
	  String Engine;
	  int Seats;
	  String Production_date;
//	  Car(){
//		    this.Name = "error";
//		    this.Engine = "error";
//		    this.Seats = 0;
//		    this.Production_date = "error";
//		  }
	  Car(String _Name, String _Engine ,int _Seats, String _Production_date){
	    this.Name = _Name;
	    this.Engine = _Engine;
	    this.Seats = _Seats;
	    this.Production_date = _Production_date;
	  }
	  public void setValue() {
		  Scanner input = new Scanner(System.in);
		  System.out.print("name :");
		  this.Name = input.next();
		  System.out.print("\nEngine :");
		  this.Engine= input.next();
		  System.out.print("\nSeats :");
		  this.Seats = input.nextInt();
		  System.out.print("\nProduction_date :");
		  this.Production_date = input.next();
	  }
	  public String toString() {
	    return "Name: " + Name + "\nEngine: " + Engine + "\nSeats: " + Seats + "\nProduction_date: " + Production_date ;
	  }
	}
public class Read_Write_Class {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Car Car1 = new Car("honda","max",4,"2021");
			FileOutputStream fos = new FileOutputStream("f:/file/mydata.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			DataOutputStream dos = new DataOutputStream(fos);
//			FileInputStream fis = new FileInputStream("f:/file/mydata.txt");
//			DataInputStream dis = new DataInputStream(fis);
			oos.writeObject(Car1);
			oos.close();
		    fos.close();
		    System.out.println("Write file success");
		  	}catch (IOException ex) {
		  		ex.printStackTrace();
		  	} 
		//Read objects from file
		
	    try{
	      FileInputStream fis = new FileInputStream(new File("f:/file/mydata.txt"));
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      Car Car2 = (Car) ois.readObject();
	      System.out.println(Car2.toString());
	      System.out.println("Read file success");
	      fis.close();
	      ois.close();
	    }catch(Exception ex){
	      ex.printStackTrace();
	    }
	}


}

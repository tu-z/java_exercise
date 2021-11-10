package Read_Write_File;
import java.util.*;
import java.io.Serializable;
import java.io.*;
class Car implements Serializable {
	  String name;
	  String engine;
	  int seats;
	  String production_date;
//	  Car(){
//		    this.name = "error";
//		    this.engine = "error";
//		    this.seats = 0;
//		    this.production_date = "error";
//		  }
	  Car(String _name, String _engine ,int _seats, String _production_date){
	    this.name = _name;
	    this.engine = _engine;
	    this.seats = _seats;
	    this.production_date = _production_date;
	  }
	  public void setValue() {
		  Scanner input = new Scanner(System.in);
		  System.out.print("name :");
		  this.name = input.next();
		  System.out.print("\nengine :");
		  this.engine= input.next();
		  System.out.print("\nseats :");
		  this.seats = input.nextInt();
		  System.out.print("\nproduction_date :");
		  this.production_date = input.next();
	  }
	  public String toString() {
	    return "name: " + name + "\nengine: " + engine + "\nseats: " + seats + "\nproduction_date: " + production_date ;
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

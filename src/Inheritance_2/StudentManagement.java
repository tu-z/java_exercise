package Inheritance_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class StudentManagement {
	private ArrayList<Student> studentList;

	public StudentManagement(ArrayList<Student> studentList) {
		super();
		this.studentList = studentList;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public int getSize() {
		return this.studentList.size();
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public static ArrayList<Student> insertData(){
		Scanner input = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		System.out.print("enter numbers of students: ");
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("students " + i +" id: ");
			String id = input.next();
			System.out.print("students " + i  +" name: ");
			String name = input.next();
			System.out.print("students " + i +" gender: ");
			char gender = input.next().charAt(0);
			System.out.print("students " + i +" birth year: ");
			int birth_year = input.nextInt();
			System.out.print("students " + i +" academic year: ");
			int academic_year = input.nextInt();
			System.out.print("students " + i +" gpa: ");
			double gpa = input.nextDouble();
			System.out.print("students " + i +" social activities: ");
			double social_activities = input.nextDouble();
			students.add(new Student(name, gender, birth_year, id, academic_year, gpa, social_activities));
		}
		return students;
	}
	

	public static  void writeFile(ArrayList<Student> file, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(file);
			oos.close();
		    fos.close();
		    System.out.println("\nWrite file success\n");
		  	}catch (IOException ex) {
		  		ex.printStackTrace();
		  	} 
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Student> readFile (String path) {
		ArrayList<Student> temp = new  ArrayList<Student>();
		try{
		      FileInputStream fis = new FileInputStream(new File("f:/file/mydata.txt"));
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      temp = (ArrayList<Student>) ois.readObject();
		      System.out.println("\nRead file success\n");
		      fis.close();
		      ois.close();
			}catch(Exception ex){
		    	ex.printStackTrace();
		    }
		return temp;
	}
	
	public static void displayStudentList(StudentManagement _sm) {
		for (int i = 0; i < _sm.getSize(); i++) {
			System.out.println("studentID :" + _sm.studentList.get(i).getStudentID() 
					+ ", name :" + _sm.studentList.get(i).getName()
					+ ", academic_year :" + _sm.studentList.get(i).getAcademic_year()
					+ ", gender : "+ _sm.studentList.get(i).getGender()
					+ ", birth year: " + _sm.studentList.get(i).getBirthYear()
					+ ", social activities: " + _sm.studentList.get(i).getSocial_activities()
					+ ", gpa: "+ _sm.studentList.get(i).getGpa());
		}
	}
	
	public static void displayStudentList(ArrayList<Student> temp ) {
		for (int i = 0; i < temp.size(); i++) {
			System.out.println("studentID :" + temp.get(i).getStudentID() 
					+ ", name :" +temp.get(i).getName()
					+ ", academic_year :" + temp.get(i).getAcademic_year()
					+ ", gender : "+ temp.get(i).getGender()
					+ ", birth year: " + temp.get(i).getBirthYear()
					+ ", social activities: " + temp.get(i).getSocial_activities()
					+ ", gpa: "+ temp.get(i).getGpa());
		}
	}

	public static void main(String[] args) {
		
		StudentManagement sm = new StudentManagement(insertData());
		displayStudentList(sm);
		GpaCompare gpaCompare = new GpaCompare();
		Collections.sort(sm.studentList, gpaCompare);
		displayStudentList(sm);
		writeFile(sm.studentList, "f:/file/mydata.txt");
		displayStudentList(readFile("f:/file/mydata.txt"));
		
		
	}	
}

package Inheritance_1;

import java.util.ArrayList;
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
			System.out.print("students " + (i + 1) +" id: ");
			String id = input.next();
			System.out.print("students " + (i + 1)  +" name: ");
			String name = input.next();
			System.out.print("students " + (i + 1) +" gender: ");
			char gender = input.next().charAt(0);
			System.out.print("students " + (i + 1) +" birth year: ");
			int birth_year = input.nextInt();
			System.out.print("students " + (i + 1) +" academic year: ");
			int academic_year = input.nextInt();
			students.add(new Student(name, gender, birth_year, id, academic_year));
		}
		return students;
	}
	
	public StudentManagement findByName(String _name){
		StudentManagement students = new StudentManagement(new ArrayList<Student>());
		for(int i = 0; i < this.studentList.size(); i++) {
			if(this.studentList.get(i).getName().equals(_name)) {
				students.studentList.add(this.studentList.get(i));
			}
		}
		return students;
	}
	
	public StudentManagement findByBirthYear( int _year){
		StudentManagement students = new StudentManagement(new ArrayList<Student>());
		for(int i = 0; i < this.studentList.size(); i++) {
			if(this.studentList.get(i).getBirthYear() == _year) {
				students.studentList.add(this.studentList.get(i));
			}
		}
		return students;
	}
	
	public static void displayStudentList(StudentManagement _sm) {
		for (int i = 0; i < _sm.getSize(); i++) {
			System.out.println("studentID: " + _sm.studentList.get(i).getStudentID() 
					+ ", name: " + _sm.studentList.get(i).getName()
					+ ", academic_year: " + _sm.studentList.get(i).getAcademic_year()
					+ ", gender: "+ _sm.studentList.get(i).getGender()
					+ ", birth year: " + _sm.studentList.get(i).getBirthYear());
		}
	}

	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement(insertData());
		displayStudentList(sm);
		System.out.print("\nlist filter by birth year\n");
		displayStudentList(sm.findByBirthYear(2002));
		System.out.print("\nlist filter by name\n");
		displayStudentList(sm.findByName("tu"));
		
	}
	
}

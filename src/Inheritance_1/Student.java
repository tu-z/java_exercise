package Inheritance_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
	private String studentID;
	private int academic_year;
	
	public Student(String name, char gender, int birth_year, String studentID, int academic_year) {
		super(name, gender, birth_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}

	@Override
	public String toString() {
		return "studentID=" + studentID + ", academic_year=" + academic_year + "," + super.toString() ;
	}
	
	
	
}

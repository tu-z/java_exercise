package Inheritance_2;

import java.io.*;
import java.util.*;

public class Student extends Person {
	private String studentID;
	private int academic_year;
	private double gpa;
	private double social_activities;
	

	public Student(String name, char gender, int birth_year, String studentID, int academic_year, double gpa, double social_activities) {
		super(name, gender, birth_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
		this.gpa = gpa;
		this.social_activities = social_activities;
	}

	
	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public double getSocial_activities() {
		return social_activities;
	}


	public void setSocial_activities(double social_activities) {
		this.social_activities = social_activities;
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
		return "studentID : " + studentID + ", academic_year : " + academic_year + "," +"gpa :" + gpa + ", social_activities : " + social_activities + ","+ super.toString() ;
	}
	
}

class GpaCompare implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if (s1.getGpa() < s2.getGpa()) return -1;
        if (s1.getGpa() > s2.getGpa()) return 1;
        else return 0;
    }
}

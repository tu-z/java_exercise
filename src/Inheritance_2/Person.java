package Inheritance_2;
import java.io.*;
import java.util.*;

public class Person implements Comparable<Person> , Serializable, Cloneable{
	private String name;
	private char gender;
	private int birth_year;
	public Person(String name, char gender, int birth_year) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_year = birth_year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBirthYear() {
		return birth_year;
	}
	public void setBirthYear(int birth_year) {
		this.birth_year = birth_year;
	}
	@Override
	public String toString() {
		return "name : " + name + ", gender : " + gender + ", birth_year : " + birth_year ;
	}
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}

package com.avn.tns.abstraction;
//Implementation class
public class Javacourse implements Course {
	public void enroll(String StudentName) {
		System.out.println(StudentName  + " has enrolled for java course");
		}
	
	public void completecourse() {
		System.out.println("Java course completed successfully");
	}
}

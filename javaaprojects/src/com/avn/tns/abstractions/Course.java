package com.avn.tns.abstractions;

public interface Course {
	//abstract method
		void enroll(String StudentName);
		void completecourse();
		
		//final variable
		int COURSE_DURATION=45;
		
		//default method
		default void greet() {
			System.out.println("Welcome to the course");
		}
		
		//static method
		static void info() {
			System.out.println("Java language training");
		}
	}


}

package com.avn.tns.abstraction;

public class CourseMain {

	public static void main(String[] args) {
		Course c=new Javacourse();
		c.greet();
		Course.info();
		
		c.enroll("Harshitha");
		c.completecourse();

	}

}

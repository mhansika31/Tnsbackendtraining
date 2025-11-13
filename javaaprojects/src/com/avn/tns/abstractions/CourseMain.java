package com.avn.tns.abstractions;

public class CourseMain {

	public static void main(String[] args) {
		Course c=new JavaCourse();
		c.greet();
		Course.info();
		
		c.enroll("Hansika");
		c.completecourse();
		
	}

}

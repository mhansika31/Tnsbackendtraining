package com.avn.tns.abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractDemo demo = new AbstractImplementation();
		demo.display();
		demo.calculateArea();
		System.out.println("Abstraction demo completed successfully!");
	}

}

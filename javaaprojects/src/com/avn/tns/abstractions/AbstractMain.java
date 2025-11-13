package com.avn.tns.abstractions;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractDemo demo = new AbstractImplementation();
		demo.display();
		demo.calculateArea();
		System.out.println("Abstraction demo completed successfully!");

	}

}

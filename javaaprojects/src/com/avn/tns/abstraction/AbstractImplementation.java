package com.avn.tns.abstraction;

// Subclass that extends abstract class and provides implementation
public class AbstractImplementation extends AbstractDemo {

    // Implementing the abstract method
    @Override
     void calculateArea() {
    	System.out.println("Calculating area inside AbstractImplementation class...");
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is " + area);
        
    }
}

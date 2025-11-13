package com.avn.tns.abstraction;

// Subclass that extends abstract class and provides implementation
public class AbstractImplementation extends AbstractDemo {

    // Implementing the abstract method
    @Override
     void calculateArea() {
<<<<<<< HEAD
    	System.out.println("Calculating area inside AbstractImplementation class...");
=======
         System.out.println("Calculating area inside AbstractImplementation class...");
>>>>>>> branch 'main' of https://github.com/mhansika31/Tnsbackendtraining.git
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is " + area);
        
    }
}



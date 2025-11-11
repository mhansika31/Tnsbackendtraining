package com.avn.tns.abstraction;

// Subclass that extends abstract class and provides implementation
public class AbstractImplementation extends AbstractDemo {

    // Implementing the abstract method
    @Override
     void calculateArea() {
         demo.display();
		 demo.calculateArea();
		 System.out.println("Abstraction demo completed successfully!");
        
    }
}


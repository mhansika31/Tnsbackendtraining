package com.avn.tns.arraydemo;
//POJO class
//java 17+
record Parents(String name,int age,double height,double weight) {}
public class PersonMain {
	public static void main(String[] args) {

		Person[] p = { new Person("maheer",15,5.6,38),
				 new Person("malini",20,5.8,50),
				 new Person("shashi",30,6.0,70),};
	}
}

package com.syntax.class13;

public class Car {

	//define car features in a form of variables:
	String make;
	String model;
	String color;
	int year;
    int speed;
    
    public static void main(String[] args) {
    	System.out.println("Helo, I'm the code from main method");
    	
    	Car c1 = new Car();
    	c1.make = "Honda";
    	c1.model ="Camry";
    	c1.color = "Pink";
    	c1.year = 2000;
    	c1.speed = 180;
    	
    	c1.drive();
		c1.reverse();
		c1.transportPeople();
		c1.stop();
    }
    
    
    //define the behavior in a form of methods:
    void drive() {
    	System.out.println(make + " can drive");
    }
    void reverse() {
    	System.out.println(make + " can reverse");
    }
    void transportPeople() {
    	System.out.println(make + " can transport people");
    }
    void stop() {
    	System.out.println(make + " will stop when press break");
    	System.out.println(make + " stop");
    }
	}


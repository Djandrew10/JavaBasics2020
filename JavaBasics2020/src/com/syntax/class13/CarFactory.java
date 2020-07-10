package com.syntax.class13;

public class CarFactory {
	public static void main(String [] args) {
		Car car1 = new Car();
		car1.make = "Tesla";
		car1.model = "X";
		car1.color = "Red";
		car1.year = 2020;
		car1.speed = 200;
		System.out.println("The make of our first car is " +car1.make + " and model is " +car1.model+
				 " and it is in " + car1.color + " color");
		
		System.out.println("-----Accesing method from Car class using car1 ----");
		car1.drive();  //-->name of the method
		car1.reverse();
		car1.transportPeople();
		
		
		//building an object of the car
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.color = "Blue";
		car2.year = 2018;
		car2.speed = 240;
		System.out.println("The make of second car is " +car2.make);
		System.out.println("-----Accesing method from Car class using car2 ----");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		
		//new Bus(); compiler will give an error
		//because we never created Bus class
		
		Car car3 = new Car();
		car3.make = "Honda";
		car3.model = "Civic";
		car3.color = "Black";
		car3.year = 2017;
		car3.speed = 200;
		System.out.println("The make of fird car is " +car3.make);
		System.out.println("-----Accesing method from Car class using car3 ----");
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		
		Car car4 = new Car();
		car4.make = "Toyota";
		car4.model = "Camry";
		car4.color = "Grey";
		car4.year = 2010;
		car4.speed = 210;
		System.out.println("The make of forth car is " +car4.make);
		System.out.println("-----Accesing method from Car class using car4 ----");
		car4.drive();
		car4.reverse();
		car4.transportPeople();
	}

}

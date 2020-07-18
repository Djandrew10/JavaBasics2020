package com.syntax.class08;

public class Main {
		  String country, capital;
		  int populationSize;
		  
		  void display(){
		    System.out.println("The capital of " +country+ " is " +capital+ " and population is " +populationSize);
		  }
		  public static void Main(String[] args){
		    
		    Main c1 = new Main();
		    c1.country = "USA";
		    c1.capital = "Washington DC";
		    c1.populationSize = 330000000;
		    c1.display();
		    
		    Main c2 = new Main();
		    c2.country = "Kazakhstan";
		    c2.capital = "Astana";
		    c2.populationSize = 18500000;
		    c2.display();
		  }
		}

package com.Class11;

public class Task2 {

	public static void main(String[] args) {
	//2.Create an array of countries. 
	//While retrieving all values from an array print capital for each country. (use 2 different loops)
				
		String[] array= {"USA","Russia","Moldova","Turkey"};
		for (int i=0; i<array.length; i++) {
			
		if(array[i].equals("Usa")) {
			System.out.println("Washington DC");
		}else if (array[i].equals("Russia")) {
			System.out.println("Moscow");
		}else if (array[i].equals("Moldova")) {
			System.out.println("Chisinau");
		}else if (array[i].equals("Turkey")) {
			System.out.println("Istambul");
		}

	}
		String[] countries= {"USA","Afghanistan","Kazakhstan","Ukraine"};
		for (String country:countries) { //1.country=USA; 2.country=Afghanistan; etc.
		switch(country) {
		case "USA":
			System.out.println("Washington DC");
			break;
		case "Afghanistan":
			System.out.println("Kabul");
			break;
		case "Kazakhstan":
			System.out.println("Astana");
			break;
		case "Ukraine":
			System.out.println("Kiev");
			break;
		}

	}
}
}

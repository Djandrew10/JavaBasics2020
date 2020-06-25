package com.Class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		String str="Students";
		
		// char character=str.charAt(7);
		// System.out.println(character);

		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+",");
			
			//indexOf() - returns an index of specified charachter
			System.out.println("________indexOf()___________");
			String str1="Sunday";
			
			int index=str1.indexOf("d");
			System.out.println(index);
			
			String str2="Syntax Technologies";
			
			System.out.println(str2.indexOf("Syntex")); //0
			System.out.println(str2.indexOf("Technologies")); //8
			System.out.println(str2.indexOf(" "));  //6
			System.out.println(str2.indexOf("w")); //-1
			
			//substring() - gives another string from your current String
			System.out.println("________substring________ ");
			
			String str3="Today is Sunday Java class";
			
			String newString=str3.substring(9);
			System.out.println(newString);
			
			System.out.println(str3.substring(0,5));  //Today
			System.out.println(str3.substring(9,20));  //Sunday Java
			System.out.println(str3.substring(16,20));  //Java
			System.out.println(str3.substring(21));  //class
			
		}
	}

}

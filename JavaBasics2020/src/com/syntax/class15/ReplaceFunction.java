package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {
		
		//replace(); --> replace old character/value with new character/value
		//replaceAll(); --> replace all characters that we specify using regular expression
		//split(); --> splits/cuts String based on the specified matching character/value
		
		String me = "I am a good tester";
		String str = "Hello";
		
		str = str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we", "us");  //if it find it --> replace it, if it will not --> does nothing
		System.out.println(me);
		
		//replacing all characters from A-Z
		String fromApplication = "Phone number is 9297771761";
		fromApplication = fromApplication.replaceAll("[A-Z]", "");
		
		System.out.println(fromApplication);  // hone number is 9297771761
		
		//replacing all characters from a-z
		fromApplication = fromApplication.replaceAll("[a-z]", "").trim();
		System.out.println("New String value is = " + fromApplication);
		
		String another = "Hello12345";
		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);       //12345
		
		String anotherWay = "HelloYIIfgjgkjlkhg45998765";
		anotherWay = anotherWay.replaceAll("[A-Za-z]", "");
		System.out.println(anotherWay);   // 45998765
		
		//replacing all numbers [0-9] from String, if speciic --> [0-5]
		String mix = "Hello76588 friends 5678964";
		mix = mix.replaceAll("[0-9]", "");   //Hello friends
		System.out.println(mix);
		
		//replace all special characters
		String mix1 = "hello $#%&***@";
		mix1 = mix1.replaceAll("[^A-Za-z0-9]", " Syntax");   //  ^  --> means "that is not"
		System.out.println(mix1);  //helloSyntaxSyntaxSyntaxSyntaxSyntaxSyntaxSyntaxSyntaxSyntax  ---> prints 8 times because replace 9 characters
		

	}

}

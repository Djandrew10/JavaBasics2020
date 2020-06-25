package com.Class11;

public class MultiDimArray2D1 {

	public static void main(String[] args) {
		// Create a 2D array where you will store the following values;
		//Mr,Mrs,Ms,Miss and Smith,Jordan,Jackson,Obama.
		//After soring values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] preName= {
				    {"Mrs","Miss","Ms","Mr"}
	                      	};
		

		String[][] lastName={
		           {"Smith","Jordan","Jackson","Obama"},
                                                };

        System.out.println(preName[0][1]+" "+lastName[0][1]);
        System.out.println(preName[0][2]+" "+lastName[0][2]);
        System.out.println(preName[0][3]+" "+lastName[0][3]);
        System.out.println(preName[0][0]+" "+lastName[0][0]);

}
}

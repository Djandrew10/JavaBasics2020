package com.class16;

public class Phone {

	String brand,model;
	boolean touchscreen, camera;
	int year, system;
	

    public static void main(String[] args) {
    	
    	Phone phone1=new Phone();
    	phone1.brand="iPhone";
    	phone1.model="X";
    	phone1.touchscreen=true;
    	phone1.camera=true;
    	phone1.year=2018;
    	phone1.system=10;
    	
    	Phone phone2=new Phone();
    	phone2.brand="Android";
    	phone2.model="XR";
    	phone2.touchscreen=false;
    	phone2.camera=true;
    	phone2.year=2019;
    	phone2.system=1;
    	
    	Phone phone3=new Phone();
    	phone3.brand="Samsung";
    	phone3.model="1";
    	phone3.touchscreen=true;
    	phone3.camera=true;
    	phone3.year=2017;
    	phone3.system=8;
    	
    
    	
    	phone1.callMyFriend();
    	phone1.playGames();
    	phone1.navigate();
    	
    
    	
    	phone2.callMyFriend();
    	phone2.playGames();
    	phone2.navigate();
    	
    	phone3.callMyFriend();
    	phone3.playGames();
    	phone3.navigate();
    	
    }

    void callMyFriend() {
	System.out.println("I can call my friend on "+brand);
	}
    void playGames() {
    	System.out.println("I can play games on "+brand);
    }
    void navigate() {
    	System.out.println("I can navigate when i'm driving on "+brand);
    }
    	
}

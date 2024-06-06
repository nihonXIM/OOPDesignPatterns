package com.jdpattern.Esingleton.stat;

public class Singleton {
	public static Singleton uniqueInstance = new Singleton();
 
	
	public int singtonInt = 0;
	
	public Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}

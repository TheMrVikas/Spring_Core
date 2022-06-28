package com.nit.test;

public class NewInstanceTest {
	
	public static void main(String[] args) {
		//1. load the class at runTime
		Class c=null;
		Object obj=null;
		try {
			c=Class.forName(args[0]);
			obj=c.newInstance();
		}catch (InstantiationException e) {
			e.getMessage();
		} 
		catch (ClassNotFoundException e) {
			e.getMessage();
		}catch (Exception e) {
			e.getMessage();
		}
	}
}

package com.nit.app;

public class NewInstanceApp {

	//static block
	static {
		System.out.println("static block executed");
	}
	
	public NewInstanceApp() {
		System.out.println("Constructor executed");
	}
}

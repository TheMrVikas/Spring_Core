package com.nit.beans;

import java.util.Date;

public class WelcomeMsg {
	private Date date;
	
	//one param constructor
	public WelcomeMsg(Date date) {
		System.out.println("WelcomeMsg constructor executed");
		this.date=date;
	}
	
	public String getWelcomeMsg(String name) {
		return "Hi "+name+" Welcome to spring core and today date is "+date;
	}
}

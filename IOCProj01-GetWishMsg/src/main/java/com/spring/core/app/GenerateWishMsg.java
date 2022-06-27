package com.spring.core.app;

import java.util.Date;

import lombok.Setter;
/**
 * 
 * @author Vikas
 *
 */
@Setter
public class GenerateWishMsg {
 private Date date;	
 
 //generate the setter method
 
 public String getWishMsg(String name) {
	 return "Hi "+name+" Welcome to Spring core and Date is ="+date;
 }
}

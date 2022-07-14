package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nit.beans.WelcomeMsg;

public class WelcomeMsgTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WelcomeMsg bean=null;
		try {
			//1. create the resource class object and load the configuration file
			res=new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
			//2. create the container and pass res object as input
			factory=new XmlBeanFactory(res);
			//3. get Bean object by passing bean ids
			bean = (WelcomeMsg) factory.getBean("wmsg");
			String msg = bean.getWelcomeMsg("Vikas");
			System.out.println("Welcome msg = "+msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

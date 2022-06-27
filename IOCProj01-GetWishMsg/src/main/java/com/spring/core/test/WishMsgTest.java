package com.spring.core.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.core.app.GenerateWishMsg;
/**
 * 
 * @author Vikas
 *
 */
public class WishMsgTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		GenerateWishMsg wishMsg=null;
		try {
			//1. read the spring bean configuration file
			res=new FileSystemResource("src/main/java/com/spring/core/cfgs/applicationContext.xml");
			//2. start the container and pass the spring bean file as input
			factory=new XmlBeanFactory(res);
			//3. pass the bean id so that we can get bean created object
			wishMsg = (GenerateWishMsg) factory.getBean("wmsg");
			//4. call the method for result
			System.out.println("Wish Msg is "+wishMsg.getWishMsg("Vikas"));
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

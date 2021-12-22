package com.acecorp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.acecorp.utils.JMail;

/*
 * Make sure to turn on Less secure app access of sender email.
 * otherwise authentication will fail.
 */

public class Test {

	public static void main(String args[]) {
		Resource r=new ClassPathResource("applicationContext.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		JMail m=(JMail)b.getBean("jMail");  
		String sender="Sender@xyz.com";//write here sender gmail id  
		String receiver="Receiver@xyz.com";//write here receiver id  
		String subject = "Test Mail..";
		String message = "Hello\n this is a test mail..";
		
		m.sendMail(sender,receiver,subject,message);  
		      
		System.out.println("success");  
	}
}

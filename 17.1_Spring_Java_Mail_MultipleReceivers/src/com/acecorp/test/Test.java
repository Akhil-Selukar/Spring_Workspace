package com.acecorp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.acecorp.utils.JMail;

public class Test {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		JMail mail = (JMail) factory.getBean("jmail");
		
		String from = "FromUser@xyz.com";
		String[] to = {"ToUser1@xyz.com","ToUser2@xyz.com"};
		String[] cc = {"CcUser1@xyz.com","CcUser2@xyz.com"};
		String subject = "17.1 Test mail..";
		String message = "Hello,\nThis is a test mail for 17.1_Sending mail to multiple receivers.\nIt also have user in cc.\n\nThanks,\nAceCorp";
		
		mail.sendMail(to, cc, from, subject, message);
		System.out.println("Mail sent");
	}

}

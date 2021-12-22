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
		
		String from = "Sendermail@xyz.com";
		String[] to = {"ToMail1@xyz.com","ToMail2@xyz.com"};
		String[] cc = {"CcMail1@xyz.com"};
		String subject = "17.2 Test mail with attachment..";
		String message = "Hello,\nThis is a test mail for 17.2 Sending mail with attachment to multiple receivers.\nIt also have user in cc.\n\nThanks,\nAceCorp";
		
		mail.sendMail(from, to, cc, subject, message);
		System.out.println("Mail sent with attachment..");
	}

}

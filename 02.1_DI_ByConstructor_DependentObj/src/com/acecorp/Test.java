package com.acecorp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory bean = new XmlBeanFactory(res);
		
		Employee emp1 = (Employee) bean.getBean("e1");
		System.out.println("DI using 'e1':");
		emp1.showInfo();
	}

}

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
		
		Employee emp2 = (Employee) bean.getBean("e2");
		System.out.println("\nDI using 'e2':");
		emp2.showInfo();
		
		Employee emp3 = (Employee) bean.getBean("e3");
		System.out.println("\nDI using 'e3':");
		emp3.showInfo();
		
	}

}

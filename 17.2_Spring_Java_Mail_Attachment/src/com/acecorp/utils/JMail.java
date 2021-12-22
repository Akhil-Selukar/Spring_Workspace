package com.acecorp.utils;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class JMail {
	
	private JavaMailSender mailSender;

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(final String from, final String[] to, final String[] cc, final String subject,final String msg) {
		try {
			
			MimeMessage message = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(message,true);
			
			helper.setFrom(from);
			helper.setTo(to);
			helper.setCc(cc);
			helper.setSubject(subject);
			helper.setText(msg);
			System.out.println("==>> line 31");
			FileSystemResource file = new FileSystemResource(new File("D:/Coding/Spring boot youtube/Code_Repository/Test Document.pdf"));
			System.out.println("==>> line 33");
			System.out.println(file);
			helper.addAttachment("Attachement_1.pdf", file);
			System.out.println("==>> line 35");
			mailSender.send(message);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

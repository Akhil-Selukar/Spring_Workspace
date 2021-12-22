package com.acecorp.utils;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class JMail {
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String[] to, String[] cc, String from, String subject, String msg) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setFrom(from);
		message.setCc(cc);
		message.setSubject(subject);
		message.setText(msg);
		
		mailSender.send(message);
	}
	
}

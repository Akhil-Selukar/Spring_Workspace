package com.acecorp.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	static Logger log = LogManager.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		
//		for Azure logging
		String requestKey = UUID.randomUUID().toString();
		System.out.println("Unique key : "+requestKey);
		ThreadContext.put("Unique key", requestKey);
		
//		log.debug("==>> Inside HomeController / index method");
		log.info("==>> Inside HomeController / index method");
		System.out.println("++>> syso log in HomeController / index method");
		return "index";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
//		log.debug("==>> Inside HomeController / admin method");
		log.info("==>> Inside HomeController / admin method");
		System.out.println("++>> syso log in HomeController / admin method");
		return "admin";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
//		log.debug("==>> Inside HomeController / auth method");
		log.info("==>> Inside HomeController / auth method");
		System.out.println("++>> syso log in HomeController / auth method");
		log.warn("==>> You Will be logged out in a sec!");
		System.out.println("++>> syso log in HomeController YOU WILL BE LOGGED OUT..!!");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			log.debug("==>> logging out user.");
			System.out.println("++>> syso log in HomeController better you stay away.");
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		log.error("==>> You are logged out");
		return "index";
	}
}

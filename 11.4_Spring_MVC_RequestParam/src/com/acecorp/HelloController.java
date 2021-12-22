package com.acecorp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(@RequestParam("name") String name, @RequestParam("pass") String password, Model m) {
		
		if(password.equals("admin")) {
			String msg = "Hello "+name+", Welcome..!!";
			m.addAttribute("message", msg);
			return "viewpage";
		}else {
			String msg = "Hello "+name+", Invalid Password, Please try again...!!";
			m.addAttribute("message", msg);
			return "errorpage";
		}
	}
}

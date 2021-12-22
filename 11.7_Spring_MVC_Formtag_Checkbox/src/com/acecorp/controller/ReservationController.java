package com.acecorp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acecorp.model.Reservation;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model m) {
		Reservation res = new Reservation();
		
		m.addAttribute("reservation", res);
		
		return "bookingform";
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		return "viewdetails";
	}
}

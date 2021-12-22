package com.acecorp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acecorp.dao.EmployeeDao;
import com.acecorp.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/showform")
	public String showForm(Model m) {
		m.addAttribute("command", new Employee());
		return "employeeform";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("emp") Employee emp) {
		dao.save(emp);
		
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewEmployee(Model m) {
		List<Employee> list = dao.getEmployees();
		m.addAttribute("list", list);
		return "viewemployee";
	}
	
	@RequestMapping("/editemp/{id}")
	public String editEmployee(@PathVariable int id, Model m) {
		Employee emp = dao.getEmployeeById(id);
		m.addAttribute("command", emp);
		return "editemployeeform";
	}
	
	@RequestMapping(value="/editsave", method = RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employee emp) {
		dao.update(emp);
		
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		dao.delete(id);
		
		return "redirect:/viewemp";
	}
}

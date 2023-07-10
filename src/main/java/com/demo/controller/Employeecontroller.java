package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entity.Employee;
import com.demo.service.Employeeservice;


@Controller
public class Employeecontroller {

	@Autowired
	Employeeservice empservice;
	
	@GetMapping("/addemp")
	public String addemp() {
		return "AddEmployee";
	}
	
	@PostMapping("/insertEmployee")
	public String insertdata(@ModelAttribute("insertEmployee") Employee emp) {
		
		empservice.addemp(emp);
		return "AddEmployee";
		
	}
	
	
}

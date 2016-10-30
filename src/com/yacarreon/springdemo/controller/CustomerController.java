package com.yacarreon.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yacarreon.springdemo.entity.Customer;
import com.yacarreon.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer service
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		// get customer from the service
		List<Customer> customers = customerService.getCustomers();
		
		// add customers to model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
}

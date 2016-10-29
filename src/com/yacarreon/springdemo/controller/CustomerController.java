package com.yacarreon.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yacarreon.springdemo.dao.CustomerDAO;
import com.yacarreon.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer dao
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		// get customer from the dao
		List<Customer> customers = customerDAO.getCustomers();
		
		// add customers to model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
	
}

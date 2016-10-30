package com.yacarreon.springdemo.dao;

import java.util.List;

import com.yacarreon.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
	
}

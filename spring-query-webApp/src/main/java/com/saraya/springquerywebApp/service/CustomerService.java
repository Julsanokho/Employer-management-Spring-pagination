package com.saraya.springquerywebApp.service;

import com.saraya.springquerywebApp.dto.CustomerDTO;
import com.saraya.springquerywebApp.entity.Customer;

public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	 
	public Iterable<Customer> getCustomer(String address);
 


}

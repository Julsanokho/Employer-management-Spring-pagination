package com.saraya.springquerywebApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.springquerywebApp.dto.CustomerDTO;
import com.saraya.springquerywebApp.entity.Customer;
import com.saraya.springquerywebApp.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository  repository; 
	  
	public void insertCustomer(CustomerDTO customer) {
		repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
	}
 
	@Override
	public Iterable<Customer> getCustomer(String address) {
		
		return repository.findByAddress(address);
	}
	



}

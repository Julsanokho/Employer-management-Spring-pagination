package com.saraya.springPaginationwebApp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.saraya.springPaginationwebApp.dto.CustomerDTO;
import com.saraya.springPaginationwebApp.entity.Customer;
 

public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	Page<Customer> findAll(Pageable page);
	List<Customer> findAll(Sort sort);


}

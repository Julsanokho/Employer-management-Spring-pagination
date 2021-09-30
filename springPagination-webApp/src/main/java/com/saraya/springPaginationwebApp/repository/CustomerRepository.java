package com.saraya.springPaginationwebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.springPaginationwebApp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
		 
	}




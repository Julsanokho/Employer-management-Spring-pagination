package com.saraya.springquerywebApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.springquerywebApp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findByAddress(String address);


}

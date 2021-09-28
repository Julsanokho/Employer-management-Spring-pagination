package com.saraya.CustomerSpringDataJpi.service;

import java.util.List;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.CustomerSpringDataJpi.dto.CustomerDTO;
import com.saraya.CustomerSpringDataJpi.entity.Customer;
import com.saraya.CustomerSpringDataJpi.reposiroty.CustomerRepository;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
		@Autowired
		private CustomerRepository repository;
	 
		@Override
		public void insertCustomer(CustomerDTO customer) {
			repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
	 
		}
	 
		@Override
		public void removeCustomer(Long phoneNo) {
			repository.deleteById(phoneNo);
	 
		}
	 
		@Override
		public CustomerDTO getCustomer(Long phoneNo) {
			Optional<Customer> optionalCustomer = repository.findById(phoneNo);
			Customer customerEntity = optionalCustomer.get();// Converting Optional<Customer> to Customer
			CustomerDTO customerDTO = Customer.prepareCustomerDTO(customerEntity);
			return customerDTO;
		}
	 
		@Override
		public String updateCustomer(Long phoneNo, Integer newPlanId) {
			Optional<Customer> optionalCustomer = repository.findById(phoneNo);
			Customer customerEntity = optionalCustomer.get();
			customerEntity.setPlanId(newPlanId);
			repository.save(customerEntity);
			return "The plan for the customer with phone Number :" + phoneNo + " has been updated successfully.";
		}
		
		
		public List<Customer>listAll(){
			return repository.findAll();
		}
		
		public void saveCustomer(Customer std) {
			repository.save(std);
		}
		
		public Customer get(long phoneNumber) {
			return repository.findById(phoneNumber).get();
		}
		
		
}

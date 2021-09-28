package com.saraya.simple_project_jdbc.service;

import com.saraya.simple_project_jdbc.dao.CustomerDAO;
import com.saraya.simple_project_jdbc.dao.CustomerDAOImpl;
import com.saraya.simple_project_jdbc.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO customerDAO = new CustomerDAOImpl();
	@Override
	public void insert(CustomerDTO customer) {
		customerDAO.insert(CustomerDTO.prepareCustomerEntity(customer));
	}
	@Override
	public int remove(Long phoneNo) {
		return customerDAO.remove(phoneNo);
		
	}
}

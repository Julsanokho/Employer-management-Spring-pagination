package com.saraya.CustomerSpringDataJpi.service;

import com.saraya.CustomerSpringDataJpi.dto.CustomerDTO;

public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	public void removeCustomer(Long phoneNo);
	public CustomerDTO getCustomer(Long phoneNo);
	public String updateCustomer(Long phoneNo,Integer newPlanId);

}

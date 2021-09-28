package com.saraya.CustomerSpringDataJpi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.CustomerSpringDataJpi.entity.Customer;
import com.saraya.CustomerSpringDataJpi.service.CustomerServiceImpl;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl service;
	@RequestMapping(value="/list-customer", method=RequestMethod.GET)		
	public String home(ModelMap model) {
		List<Customer> listCustomer = service.listAll();
		model.addAttribute("listCustomer",listCustomer);
		System.out.print("Get /");		
			return "list-customer";
		}
	
	@RequestMapping(value = "/customer-form", method = RequestMethod.GET, 
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.ALL_VALUE})
	public String customerForm(ModelMap model) {
	
	Customer customer = new Customer();
	model.addAttribute("customer", customer);
	return "addCustomer";
}


@RequestMapping(value = "/save-customer", method = RequestMethod.POST, 
                     consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.ALL_VALUE}, headers = "content-type=application/x-www-form-urlencoded")
public String saveNewCustomer(@ModelAttribute("customer") Customer customer, BindingResult bindingResult) throws Exception{

if(bindingResult.hasErrors()) {
return "addCustomer";
}

service.saveCustomer(customer);
return "redirect:/list-customer";  
}
	
	
	
	@RequestMapping(value = "/delete-customer/{phoneNumber}", method = RequestMethod.GET)
	public String deleteCosmetiqueById(@RequestParam Long phoneNumber, ModelMap model){
		service.removeCustomer(phoneNumber);
		model.clear();
		return "redirect:/list-customer";
	}
	
	@RequestMapping(path = "/update-customer", method = RequestMethod.GET)
	public String updateCosmetiqueForm( ModelMap model, @RequestParam Long phoneNumber,int planId) {
		model.addAttribute("customer", service.updateCustomer(phoneNumber,planId));
		return "updateList";
	}

	@RequestMapping(value = "/update-customer", method = RequestMethod.POST) 
    public String cosmetiqueUpdate(ModelMap model, @ModelAttribute("customer") Customer customer){
		customer.setPhoneNumber(customer.getPhoneNumber());
		customer.setAddress(customer.getAddress());
		customer.setAge(customer.getAge());
		customer.setGender(customer.getGender());
		customer.setName(customer.getName());
		customer.setPlanId(customer.getPlanId());
		model.clear();
		return "redirect:/list-customer";  
		}
	
	
}

package com.saraya.employerManagementpaginationwebApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.saraya.employerManagementpaginationwebApp.dto.EmployerDTO;
import com.saraya.employerManagementpaginationwebApp.entity.Employer;
import com.saraya.employerManagementpaginationwebApp.repository.EmployerRepository;

@Service("EmployerService")
public class EmployerServiceImpl implements EmployerService {
	@Autowired
	private EmployerRepository repository;
	
	public void insertEmployer(EmployerDTO employer) {
		repository.saveAndFlush(EmployerDTO.prepareEmployerEntity(employer));
	}
	
	@Override
	public Page<Employer> findAll(Pageable page) {
		return repository.findAll(page);
		
	}
	@Override
	public List<Employer> findAll(Sort sort) {
		return repository.findAll(sort);
	
	}
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	

}

package com.saraya.employerManagementpaginationwebApp.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import com.saraya.employerManagementpaginationwebApp.dto.EmployerDTO;
import com.saraya.employerManagementpaginationwebApp.entity.Employer;

public interface EmployerService {
	public void insertEmployer(EmployerDTO employer);
	Page<Employer> findAll(Pageable page);
	List<Employer> findAll(Sort sort);

}

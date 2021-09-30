package com.saraya.employerManagementpaginationwebApp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.saraya.employerManagementpaginationwebApp.dto.EmployerDTO;
import com.saraya.employerManagementpaginationwebApp.entity.Employer;
import com.saraya.employerManagementpaginationwebApp.repository.EmployerRepository;
import com.saraya.employerManagementpaginationwebApp.service.EmployerService;

@SpringBootApplication
public class Client implements CommandLineRunner {
	static Logger logger = Logger.getLogger(Client.class);
	@Autowired
	EmployerService service;
	@Autowired
	EmployerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		EmployerDTO employer1= new EmployerDTO(781111594L, "Jul", 24, 'M', "Dakar", 300000, 1);
		EmployerDTO employer2= new EmployerDTO(770440803L, "Boubacar", 22, 'M', "Kaolack", 300000, 2);
		EmployerDTO employer3= new EmployerDTO(783396374L, "Dieyna", 25, 'F', "Fouta", 300000, 3);
		EmployerDTO employer4= new EmployerDTO(782587118L, "Ousmane", 25, 'M', "Fatick", 300000, 4);
		EmployerDTO employer5= new EmployerDTO(702223487L, "Amadou", 18, 'M', "Diourbel", 300000, 5);
		EmployerDTO employer6= new EmployerDTO(761091098L, "Tamsir", 23, 'M', "Kolda", 300000, 6);
		
		service.insertEmployer(employer1);
		service.insertEmployer(employer2);
		service.insertEmployer(employer3);
		service.insertEmployer(employer4);
		service.insertEmployer(employer5);
		service.insertEmployer(employer6);
		
		
		int k=(int) (repository.count()/3);
        for(int i=0;i<=k;i++){
        Pageable pageable = PageRequest.of(i,3);
        
        logger.info("Records are: ");
        Iterable<Employer> customer8 = service.findAll(pageable);
        
        for(Employer alist3 : customer8){
             logger.info(alist3);
        }
        }
        logger.info("Sorted records..");
	        
       Iterable<Employer> customer8 = service.findAll(Sort.by(Sort.Direction.DESC,"name"));
        
        for(Employer alist3 : customer8){
             logger.info(alist3);
        }     
        
	}
		
}

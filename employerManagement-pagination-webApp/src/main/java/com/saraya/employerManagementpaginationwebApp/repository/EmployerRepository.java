package com.saraya.employerManagementpaginationwebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.employerManagementpaginationwebApp.entity.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Long> {

}

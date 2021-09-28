package com.saraya.CustomerSpringDataJpi.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saraya.CustomerSpringDataJpi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{


}

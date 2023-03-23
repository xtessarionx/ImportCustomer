package com.sat.demo.batchDemo.repository;

import com.sat.demo.batchDemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

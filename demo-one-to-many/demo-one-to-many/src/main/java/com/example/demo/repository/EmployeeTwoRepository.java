package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeTwo;
@Repository
public interface EmployeeTwoRepository extends JpaRepository<EmployeeTwo, Long> {

}

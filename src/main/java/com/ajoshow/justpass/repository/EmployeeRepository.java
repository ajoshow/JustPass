package com.ajoshow.justpass.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajoshow.justpass.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	 
}
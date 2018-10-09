package com.springdata.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.springdata.model.Employee;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Integer> {
	
}

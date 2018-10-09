package com.springdata.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.model.Employee;
import com.springdata.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@PostConstruct
	public void addEmployees() {
		List<Employee> employess = new ArrayList<>();
		employess.add(new Employee(123, "andi", new String[] {"Jl. Palmerah","JKT"}));
		employess.add(new Employee(456, "budi", new String[] {"Jl. Puncak","BGR"}));
		repository.saveAll(employess);
	}
	
	@GetMapping("/getall")
	public Iterable<Employee> getEmployee(){
		return repository.findAll();
	}
	

	
}

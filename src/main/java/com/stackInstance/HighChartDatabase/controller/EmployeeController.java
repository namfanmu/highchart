package com.stackInstance.HighChartDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.stackInstance.HighChartDatabase.model.Employee;
import com.stackInstance.HighChartDatabase.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

}

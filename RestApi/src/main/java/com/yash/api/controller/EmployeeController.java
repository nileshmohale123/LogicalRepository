package com.yash.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yash.api.model.Employee;
import com.yash.api.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}

	@PostMapping("/saveAll")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {

		return employeeService.saveEmployees(employees);
	}

	@GetMapping("/get")
	public List<Employee> findAllEmployee() {

		return employeeService.getEmployee();
	}

	@GetMapping("/get/{id}")
	public Employee findEmployeeById(@PathVariable int id) {

		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/get/{name}")
	public Employee findEmployeeByNmae(@PathVariable String name) {

		return employeeService.getEmployeeByName(name);
	}

	@PutMapping("/update")
	public Employee updateEmployee(Employee employee) {

		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/delete")
	public String updateEmployee(@PathVariable int id) {

		return employeeService.deleteEmployee(id);
	}

}

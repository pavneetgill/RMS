package rms.maintenance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rms.maintenance.model.Employee;
import rms.maintenance.service.EmployeeService;

@RestController

public class EmployeeController {
	 

	@Autowired
	EmployeeService emp;
	 
	 @RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json",  produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Employee> getCountries() {
	 List<Employee> employeeList = emp.getAllEmployees();
	 return employeeList;
	 }
	 
	 @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json",  produces = MediaType.APPLICATION_JSON_VALUE)
	 public Employee getCountryById(@PathVariable int id) {
	 return emp.getEmployee(id);
	 }
	 
	 @RequestMapping(value = "/employees", method = RequestMethod.POST, headers = "Accept=application/json")
	 public Employee addEmployee(@RequestBody Employee employee) {
	 return emp.addEmployee(employee);
	 }
	 
	 @RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public Employee updateCountry(@RequestBody Employee employee) {
	 return emp.updateEmployee(employee);
	 
	 }
	 
	 @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteEmployee(@PathVariable("id") int id) {
	 emp.deleteEmployee(id);
	 
	 } 
	
}

package rms.maintenance.service;

import java.util.List;

import rms.maintenance.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	
}

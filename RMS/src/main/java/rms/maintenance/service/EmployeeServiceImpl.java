package rms.maintenance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rms.maintenance.model.Employee;
import rms.maintenance.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired EmployeeRepository empRepo;
	@Override
	public Employee addEmployee(Employee employee) {
		if (employee == null)
			throw new IllegalArgumentException("Employee is null");

		return empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		
		empRepo.findAll().forEach(list::add);
		
		return list;
	}

	@Override
	public Employee getEmployee(int id) {
		if (id == 0) 
			throw new IllegalArgumentException("Emp Id is 0");
		
		Employee emp = empRepo.findOne(id);
		
		if (emp == null) throw new IllegalArgumentException("Emp with given Emp id does not exist");
		
		return emp;
	}

	@Override
	public void deleteEmployee(int id) {
		if (id == 0)
			throw new IllegalArgumentException("Emp Id is null");

		if (getEmployee(id) != null)
			empRepo.delete(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if (employee == null)
			throw new IllegalArgumentException("Employee is null");

		Employee currentEmployee = getEmployee(employee.getEmpId());

		if (currentEmployee == null)
			throw new IllegalArgumentException(
					"Employee doees not exist with given emp id.");

		BeanUtils.copyProperties(employee, currentEmployee);

		return empRepo.save(currentEmployee);
	}

}

package rms.maintenance.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rms.maintenance.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}

package rms.maintenance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public  @Data class EmployeeType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String description;
	
	String deptCode;

}

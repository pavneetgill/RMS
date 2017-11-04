package rms.maintenance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;


@Entity

public @Data class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int empId;

	private int deptId;

	private int empType;

	private String fname;

	private String lname;

	private String mInitial;

	private String dob;

	private String gender;

	private String address1;

	private String addresss2;

	private String city;

	private String state;

	private String email;

	private String phoneNumber;

	private String managerId;



}

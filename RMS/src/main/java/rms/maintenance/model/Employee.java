package rms.maintenance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;


@Entity
@Table(name="employee")
public @Data class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empId")
	private int empId;

	@Column(name="deptId")
	private int deptId;

	@Column(name="empType")
	private int empType;

	@Column(name="fname")
	private String fname;

	@Column(name="lname")
	private String lname;

	@Column(name="minitial")
	private String minitial;

	@Column(name="dob")
	private String dob;

	@Column(name="gender")
	private String gender;

	@Column(name="address1")
	private String address1;

	@Column(name="address2")
	private String address2;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="email")
	private String email;

	@Column(name="phoneNumber")
	private String phoneNumber;

	@Column(name="managerId")
	private String managerId;



}

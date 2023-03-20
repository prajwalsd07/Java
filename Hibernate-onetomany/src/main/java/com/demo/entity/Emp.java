package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MYEMP") // O-R mapping
public class Emp {

	@Id // primary key mapping
	@Column(name = "EMPNO")
	private Integer empId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String city;

	@Column(name = "SALARY")
	private Double salary;

	@ManyToOne

	@JoinColumn(name = "DNO")

	private Dept dept;

	public Emp() {

	}

	public Emp(Integer empId, String name, String city, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter name called : " + name);
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
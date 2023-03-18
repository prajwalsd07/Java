package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * Mapping Class Emp
 * @author mohta
 *
 */

@Entity
@Table(name = "MYEMP") //O-R mapping 
@NamedQueries(
		{@NamedQuery(name="demo1",query = "select e from Emp e")}
		)
public class Emp {

	/**
	 * when variable here and column names 
	 * are same there is no need of @annotations
	 */
	/**
	 * Data from Employee class goes to column
	 */
	
	@Id //primary key mapping
	@Column(name = "EMPNO")
	private Integer empId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ADDRESS")
	private String city;
	
	@Column(name = "SALARY")
	private Double salary;
	
	@ManyToOne
	/**
	 * Bi directional
	 * Entity Emp references a single instance of Entity Dept
	 * so Emp is the owner of the relationship
	 * Entity Dept references a collection of Entity Emp
	 * 
	 */
	
	//if we dont specify explicitly join column
	//It will search for default 
	//like Dept_Dno
	
	@JoinColumn (name = "DNO")
	/**
	 * Foreign key 
	 * JoinColumn is used to connect Emp 
	 * and Dept using foreign key.
	 */
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
		System.out.println("Setter name called : "+name);
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

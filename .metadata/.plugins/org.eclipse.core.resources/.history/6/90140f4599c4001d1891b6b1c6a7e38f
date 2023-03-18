package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * one department has collection of employee
 * one to many
 * @author mohta
 *
 */
@Entity
@Table(name = "MYDEPT")
public class Dept {

	@Id
	@Column(name = "DNO")
	private Integer deptNo;
	
	@Column(name = "DNAME")
	private String deptName;
	
	@Column(name = "MANAGER")
	private String manager;
	
	/**
	 * One is present class 
	 * Many is Other class
	 */
	@OneToMany(cascade = CascadeType.ALL)
	//.mappedBy ="DNO";//.fetch=fetchType.LAZY
	//disables the updation from collection side 
	//data will be entered but never updated
	/**
	 * Whatever we update in dept should also effect in 
	 * Emp
	 */
	@JoinColumn(name = "DNO")
	private Set<Emp> emps = new HashSet<>();
	
	public Dept() {
		
	}
	public Dept(Integer deptNo, String deptName, String manager) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.manager = manager;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	
}

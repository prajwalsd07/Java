package com.demo.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Customer")
public class Customer {

	/**
	 * Auto Generation of Id
	 */
	@Id
	/**
	 * Will generate from 01
	 */
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	private String customerName;
	private String email;
	
	
	/**
	 * Uni Directional
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private ShippingAddress address;
	public Customer() {
		
	}
	public Customer(String customerName, String email) {
		super();
		this.customerName = customerName;
		this.email = email;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ShippingAddress getAddress() {
		return address;
	}
	public void setAddress(ShippingAddress address) {
		this.address = address;
	}
	
}

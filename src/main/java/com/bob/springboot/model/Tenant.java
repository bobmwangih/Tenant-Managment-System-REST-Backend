package com.bob.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tenants")
public class Tenant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="idNumber")
	private String idNumber;
	
	@Column(name="dateOfLease")
	private String dateOfLease;
	
	@Column(name="monthsPaid")
	private String monthsPaid;
	
	@Column(name="houseNumber")
	private String houseNumber;
	
	@Column(name="dateofTransaction")
	private String dateOfTransaction;
	
	@Column(name="houseType")
	private String houseType;
	
	@Column(name="rate")
	private String rate;

	public Tenant() {
		
	}



	public Tenant(Long id, String firstName, String lastName, String phoneNumber, String idNumber, String dateOfLease,
			String monthsPaid, String houseNumber, String dateOfTransaction, String houseType, String rate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.idNumber = idNumber;
		this.dateOfLease = dateOfLease;
		this.monthsPaid = monthsPaid;
		this.houseNumber = houseNumber;
		this.dateOfTransaction = dateOfTransaction;
		this.houseType = houseType;
		this.rate = rate;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getDateOfLease() {
		return dateOfLease;
	}

	public void setDateOfLease(String dateOfLease) {
		this.dateOfLease = dateOfLease;
	}

	public String getMonthsPaid() {
		return monthsPaid;
	}

	public void setMonthsPaid(String monthsPaid) {
		this.monthsPaid = monthsPaid;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getDateOfTransaction() {
		return dateOfTransaction;
	}


	public void setDateOfTransaction(String dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}



	public String getHouseType() {
		return houseType;
	}



	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}



	public String getRate() {
		return rate;
	}



	public void setRate(String rate) {
		this.rate = rate;
	}

		
	
}

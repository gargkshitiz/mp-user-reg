package com.mp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * @author Kshitiz Garg
 */
@Entity
@Table(name = "user_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
    @OneToOne(mappedBy = "address")
	private User customer;
	
    @Column
	private String streetAddress;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private long zipCode;
	
	public Address() {
		super();
	}
	
	public Address(String streetAddress, String city, String state, long zipCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return new StringBuilder(streetAddress).append("\n").append(city).append(state).append(zipCode).toString();
	}

}
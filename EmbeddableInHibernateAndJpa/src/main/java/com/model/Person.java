package com.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Person")
public class Person {

	@Id
	private Integer id;
	@Embedded
	private Name name;
	@Embedded
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
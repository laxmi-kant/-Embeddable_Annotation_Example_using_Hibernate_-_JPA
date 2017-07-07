//package com.model;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//@Entity(name="Contact")
//public class Contact {
//
//	@Id
//	private int id;
//	@Embedded
//	private Name name;
//	@AttributeOverrides(
//	        @AttributeOverride(
//	            name = "line1",
//	            column = @Column( name = "home_address_line1" )
//	        )
//	        @AttributeOverride(
//	            name = "line2",
//	            column = @Column( name = "home_address_line2" )
//	        )
//	        @AttributeOverride(
//	            name = "zipCode.postalCode",
//	            column = @Column( name = "home_address_postal_cd" )
//	        )
//	        @AttributeOverride(
//	            name = "zipCode.plus4",
//	            column = @Column( name = "home_address_postal_plus4" )
//	        )
//	    ))
//	private Address address;
//}

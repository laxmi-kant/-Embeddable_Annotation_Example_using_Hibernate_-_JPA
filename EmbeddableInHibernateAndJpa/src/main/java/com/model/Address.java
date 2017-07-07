package com.model;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {

    private String line1;

    private String line2;

    @Embedded
    private ZipCode zipCode;

  

    public String getLine1() {
		return line1;
	}



	public void setLine1(String line1) {
		this.line1 = line1;
	}



	public String getLine2() {
		return line2;
	}



	public void setLine2(String line2) {
		this.line2 = line2;
	}



	public ZipCode getZipCode() {
		return zipCode;
	}



	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}



}
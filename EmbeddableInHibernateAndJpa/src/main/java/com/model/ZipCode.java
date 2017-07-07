package com.model;

import javax.persistence.Embeddable;

@Embeddable
public  class ZipCode {

    private String postalCode;

    private String plus4;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPlus4() {
		return plus4;
	}

	public void setPlus4(String plus4) {
		this.plus4 = plus4;
	}


}
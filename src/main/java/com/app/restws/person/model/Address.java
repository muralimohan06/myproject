package com.app.restws.person.model;

import javax.annotation.Resource;

public class Address {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	//abc bca
}

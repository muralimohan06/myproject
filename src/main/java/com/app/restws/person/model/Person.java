package com.app.restws.person.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Person")
public class Person {

	private int pid;
	private String name;

	private Address address;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "person: " + pid + System.lineSeparator() + "personName" + name + System.lineSeparator() + "Address "
				+ address.getCity();
	}

}

package com.example.demo;

public class Address {

	private int pincod;
	private String street;
	private String village;
	private String mandal;
	public Address(int pincod, String street, String village, String mandal, String distict) {
		super();
		this.pincod = pincod;
		this.street = street;
		this.village = village;
		this.mandal = mandal;
		this.distict = distict;
	}
	private String distict;
}

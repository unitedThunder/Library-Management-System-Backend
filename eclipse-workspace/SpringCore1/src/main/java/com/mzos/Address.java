package com.mzos;

public class Address {

	private String City;
	private String State;
	private int Zip;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return Zip;
	}
	public void setZip(int zip) {
		Zip = zip;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int zip) {
		super();
		City = city;
		State = state;
		Zip = zip;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", Zip=" + Zip + "]";
	}
	
}

package com.addressbook;

public class PersonInfo {
	private String person_name;
	private String address;
	private String city;
	private String state;	
	private long number;

	//Creating Setter Method
	public void setName(String person_name) {
		this.person_name = person_name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}

	//Creating getter Method
	public String getName() {
		return person_name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public long getNumber() {
		return number;
	}

	// Parameterized Constructor
	public PersonInfo(String pname, String paddress,String pcity,String pstate, long pnum) {

		setName(pname);
		setAddress(paddress);
		setCity(pcity);
		setState(pstate);
		setNumber(pnum);
	}

	@Override
	public String toString() {
		return "PersonInfo [person_name=" + person_name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", number=" + number + "]";
	}

	// Method for displaying person record
	public void display() {
		System.out.println("Person Name= :- " + person_name + "\nPerson Address :- " + address +"\n Person City :- " + city + "\nPerson State :- " + state
				+ "\nPerson number=" + number);
	}
}

package com.revature.project.model;

public class Customer {

	private int custid;
	private String firstName;
	private String lastname;
	private int age;
	private String ssn;
	private String email;
	private String dob;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String firstName, String lastname, int age, String ssn,
			String email, String dob) {
		super();
		this.custid = custid;
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		this.ssn = ssn;
		this.email = email;
		this.dob = dob;
	}

	
	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "CustomerModel [custid=" + custid + ", firstName=" + firstName + ", lastname=" + lastname + ", age="
				+ age + ", ssn=" + ssn + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
	
	
}

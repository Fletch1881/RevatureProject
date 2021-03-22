package com.revature.project2.model;

public class Customer {

	private int custid;
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private String email;
	private String dateofbirth;
	private String mypass;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String firstName, String lastName, int age, String ssn, String email,
			String dateofbirth, String mypass) {
		super();
		this.custid = custid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.email = email;
		this.dateofbirth = dateofbirth;
		this.mypass = mypass;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getMypass() {
		return mypass;
	}

	public void setMypass(String mypass) {
		this.mypass = mypass;
	}

	
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", ssn=" + ssn + ", email=" + email + ", dateofbirth=" + dateofbirth + ", mypass=" + mypass + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + custid;
		result = prime * result + ((dateofbirth == null) ? 0 : dateofbirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mypass == null) ? 0 : mypass.hashCode());
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (custid != other.custid)
			return false;
		if (dateofbirth == null) {
			if (other.dateofbirth != null)
				return false;
		} else if (!dateofbirth.equals(other.dateofbirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mypass == null) {
			if (other.mypass != null)
				return false;
		} else if (!mypass.equals(other.mypass))
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
	
	
	
	
	
}

package com.Bridgelabs;

public class Contact {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zipCode;
		String mobileNumber;
		String email;
	
		Contact(String firstName, String lastName, String address, String city, String state, String zipCode, String mobileNumber, String email){
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zipCode =zipCode;
			this.mobileNumber = mobileNumber;
			this.email = email;
		}

		@Override
			public String toString() {
				return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
						+ city + ", state=" + state + ", zipCode=" + zipCode + ", mobileNumber=" + mobileNumber + ", email="
						+ email + "]";
			}	
}

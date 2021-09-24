package com.Bridgelabs;

import java.util.ArrayList;
import java.util.Scanner; 

public class AddressBook {
	 	static ArrayList<Contact> contactList = new ArrayList<>();
	
	 	private void createContact() {
	 		Scanner scan = new Scanner(System.in);

	 		System.out.print("Enter First Name: ");
	 		String firstName = scan.nextLine();

	 		System.out.print("Enter Last Name: ");
	 		String lastName = scan.nextLine();

	 		System.out.print("Enter Address: ");
	 		String address = scan.nextLine();

	 		System.out.print("Enter City: ");
	 		String city = scan.nextLine();

	 		System.out.print("Enter State: ");
	 		String state = scan.nextLine();

	 		System.out.print("Enter ZipCode: ");
	 		String zipcode = scan.nextLine();

	 		System.out.print("Enter Mobile Number: ");
	 		String number = scan.nextLine();

	 		System.out.print("Enter Email id: ");
	 		String email = scan.nextLine();

	 		Contact contact = new Contact(firstName, lastName, address, city, state, zipcode, number, email);
	 		contactList.add(contact);
	 		System.out.println("\nContact Added.......\n");
	 	}

	 	public static void main(String[] args) {
	 			System.out.println("*******************************************");
	 			System.out.println(" Welcome to the address book program \n*******************************************");
		
	 			AddressBook addressBook = new AddressBook();
	 			int choice =0;
	 			while (choice == 0) {
	 				
	 				Scanner scan = new java.util.Scanner(System.in);
	 				System.out.println("1. Add Contact \n2. Exit ");
	 				int option = scan.nextInt();
	 				
	 				switch(option) {
	 				case 1:
	 					addressBook.createContact();
	 					break;
	 				case 2:
	 					choice=1;
	 					break;
	 				default:
	 					System.out.println("Please enter 1 or 2 only");
	 				}
	 			}
	 	}
}

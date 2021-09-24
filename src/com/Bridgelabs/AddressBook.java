package com.Bridgelabs;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner; 

public class AddressBook {
	 	static ArrayList<Contact> contactList = new ArrayList<>();
	
	 	 void createContact() {
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
	 	
	 	 void edit() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name To Edit from Contact list: ");
	        String FirstName = scanner.nextLine();
	        for (Contact value : contactList) {
	            if (Objects.equals(FirstName,value.firstName)) {
	                System.out.print("Enter First Name: ");
	                String firstName = scanner.nextLine();
	                
	                System.out.print("Enter Last Name: ");
	                String lastName = scanner.nextLine();
	                
	                System.out.print("Enter Address: ");
	                String address = scanner.nextLine();
	               
	                System.out.print("Enter City: ");
	                String city = scanner.nextLine();
	               
	                System.out.print("Enter State: ");
	                String state = scanner.nextLine();
	                
	                System.out.print("Enter ZipCode: ");
	                String zipcode = scanner.nextLine();
	                
	                System.out.print("Enter Phone Number: ");
	                String number = scanner.nextLine();
	                
	                System.out.print("Enter Email id: ");
	                String email = scanner.nextLine();
	               
	                System.out.println("\n Success !  contact updated.....\n");

	            } else System.out.println("The name entered is incorrect.");
	            
	        }
	    }
	 	 
	 	 void showOutput() {
	        System.out.println("*****************\n  Address List\n***************** ");
	        for (Contact contact : contactList) {
	            System.out.println(contact.toString());
	        }
	    }

	 	public static void main(String[] args) {
	 			System.out.println("*******************************************");
	 			System.out.println(" Welcome to the address book program \n*******************************************");
		
	 			AddressBook addressBook = new AddressBook();
	 			int choice =0;
	 			while (choice == 0) {
	 				
	 				Scanner scan = new java.util.Scanner(System.in);
	 				System.out.println("1. Add Contact \n2. Edit \n3. Show Output \n4. Exit ");
	 				int option = scan.nextInt();
	 				
	 				switch(option) {
	 				case 1:
	 					addressBook.createContact();
	 					break;
	 				case 2:
	 					addressBook.edit();
	 					break;
	 				case 3:
	 					addressBook.showOutput();
	 					break;
	 				case 4:
	 					choice=1;
	 					
	 				default:
	 					System.out.println("Please enter 1,2,3 or 4 only");
	 				}
	 			}
	 	}
}

package com.Bridgelabs;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner; 

public class AddressBook {
	 	static ArrayList<Contact> contactList = new ArrayList<>();
	
	 	//creating method to create a contact in address book
	 	 void createContact() {
	 		Scanner scan = new Scanner(System.in);                               //taking user input

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
	 		System.out.println("\nContact Created.......\n");
	 	}
	 	
	 	 // creating edit method by using first name to identify
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
	               
	                System.out.println("\n Success !  contact edited.....\n");

	            } else System.out.println("The first name entered is incorrect.");
	            
	        }
	    }
	 	 
	 	 //method to show created address output
	 	 void showOutput() {
	        System.out.println("*****************");
	        System.out.println("Address List\n***************** ");
	        for (Contact contact : contactList) {
	            System.out.println(contact.toString());
	        }
	    }
	 	 
	 	 void deleteMethod() {
	 		 Scanner scanner = new Scanner(System.in);
	         System.out.println("Enter Name To Remove from Contact list: ");
	         String firstName = scanner.nextLine();
	         for (int i = 0; i < contactList.size(); i++) {
	             if (Objects.equals(firstName, contactList.get(i).firstName)) {
	                 contactList.remove(contactList.get(i));
	                 System.out.println("\nDeleted Successfully.....\n");
	             } else System.out.println("The name entered is incorrect.");
	         }
	 		 
	 	 }

	 	public static void main(String[] args) {
	 			System.out.println("*******************************************");
	 			System.out.println(" Welcome to the address book program \n*******************************************");
		
	 			AddressBook addressBook = new AddressBook();
	 			int choice =0;
	 			while (choice == 0) {
	 				
	 				Scanner scan = new java.util.Scanner(System.in);
	 				System.out.println("1. Add Contact \n2. Edit Contact \n3. Show Contact Output \n4. Delete Contact \n5. Exit from program ");
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
	 					addressBook.deleteMethod();
	 					break;
	 				case 5:
	 					choice=1;
	 					
	 				default:
	 					System.out.println("Please enter 1, 2, 3, 4 or 5 only");
	 				}
	 			}
	 	}
}

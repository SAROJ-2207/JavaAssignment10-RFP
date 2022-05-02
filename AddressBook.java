package com.addressbook;

import java.util.ArrayList;
import java.util.*;

public class AddressBook {
	List<PersonInfo> person = new ArrayList<>(); 
	
	Scanner input = new Scanner(System.in);
	//Add New Person record to arraylist
	public void addPerson () {
			
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Name :- ");
		String name = obj.nextLine();
		
		System.out.print("Enter Address :- ");
		String adrs = obj.nextLine();
		
		System.out.print("Enter City :- ");
		String city = obj.nextLine();
		
		System.out.print("Enter State :- ");
		String state = obj.nextLine();
		
		System.out.print("Enter Phone Number :- ");
		long  pnum = obj.nextInt();
				
		// constructor new person object
		PersonInfo pi = new PersonInfo(name,adrs,city,state,pnum);
	    
		//Add the above PersonInfo object to arraylist
		person.add(pi);
	}
	
	//Search person information by name
	public void searchPerson (String name) {
		 for (int i = 0; i< person.size(); i++) {
			 PersonInfo p = (PersonInfo) person.get(i);
			if(name.equals(p.getName())) {
				p.display();
			}
		 }		
	 }
	
	//Delete person information by name
	public void deletePerson (String name) {
		 for (int i = 0; i< person.size(); i++) {
			 PersonInfo p = (PersonInfo) person.get(i);
			if(name.equals(p.getName())) {
				p.display();
				person.remove(i);
			}
		 }		
     }

	//Displaying the person information by name
	public void display() {
		for (int i = 0; i< person.size(); i++) {
			System.out.println(person.get(i).toString());
		}		
	}		
}
package com.addressbook;
/**
 * Address Book Program Main
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

		AddressBook obj = new AddressBook();
		Scanner sc = new Scanner(System.in);

		String opt = "y";
		while (opt.equalsIgnoreCase("y")) {
			System.out.println(" Eneter 1 to add " + "\n Enter 2 to Search " + "\n Enter 3 to Delete "+ "\n===================");
		
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				obj.addPerson();
				obj.display();
				break;
			case 2:
				System.out.println("Enter name to Search :- ");
				String name = sc.nextLine();
				obj.searchPerson(name);
				break;
			case 3:
				System.out.println("Enter name For Delete :- ");
				String dname = sc.nextLine();
				obj.deletePerson(dname);
				break;
			default:
				System.out.println("Wrong Input Please Try Again....");

			}
			System.out.println(" Any More Y/N");
			opt = sc.next();
		}
	}
}

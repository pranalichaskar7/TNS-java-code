package com.tnsif.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);


		System.out.println("Enter customer id:");
		int id = Sc.nextInt();
		
		System.out.println("Enter Customer Name:");
		String name= Sc.next();
		
		System.out.println("Enter Customer City:");
		String city= Sc.next();
		
		System.out.println(" ");
		
		Customer c1= new Customer();// default constructor invoked
		
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomercity(city);
		
		
		Customer c2 = new Customer(name, id ,city);
		System.out.println(c2);
		

	}

}

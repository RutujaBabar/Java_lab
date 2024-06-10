package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.link_queue.implementqueue;

public class EmployeeImpt implements employeeInterface{
	private implementqueue eque;
	
	//create constructor
	public EmployeeImpt() {
		eque = new implementqueue();
	}
	
	//insert data function
	@Override
	public void insertdata() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id :");
		int eid = sc.nextInt();
		System.out.println("Enter Employee Fullname :");
		String fnm = sc.next();
		System.out.println("Enter Employee gender :");
		String gn = sc.next();
		System.out.println("Enter position : ");
		int pos = sc.nextInt();
		eque.adddata(new Employee(eid,fnm,gn),pos);
		
	}


	//Remove Employee data function
	@Override
	public void removeemp(int id) {
		eque.removedata(id);
		
	}


	//Display Employee Data function
	@Override
	public void displaydata() {
		eque.display();
		
	}

	//Display only Female Employee Data function
	@Override
	public void displayfemaledata() {
		eque.femaledata();
		
	}

	//Display only Male Employee Data function
	@Override
	public void displaymaledata() {
		eque.maledata();
		
	}

	@Override
	public void emptyqueuerecursionnn() {
		
		eque.emptyqueuerecursion();
		
	}

	@Override
	public void queueinreverse() {
		// TODO Auto-generated method stub
		eque.queuereverse();
		
	}
	
	
	
	
		 
	

}

package com.demo.service;

import java.util.Scanner;

import com.demo.queue.QueueLinkedList;

public class EmployeeServiceImpl implements EmployeeService {
	private QueueLinkedList que;
	
	
	public EmployeeServiceImpl() {
		que = new QueueLinkedList();
	}
	
	@Override
	public void insertEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		System.out.println("Enter Full Name");
		String nm=sc.next();
		System.out.println("Enter Employee Gender");
		String gn=sc.next();
		que.addEmployee(id);
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}

}

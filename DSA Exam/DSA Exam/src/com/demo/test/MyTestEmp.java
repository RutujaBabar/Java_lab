package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class MyTestEmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeServiceImpl();
		int choice;
		do {
			System.out.println("1. Insert New Employee \n2. Remove Employee");
			System.out.println("3. Print Complete Queue\n4. Print All Female Employee\n5. Print All Male Employee");
			System.out.println("6. Empty Queue \n7. Print Queue In Reverese Order \n8. Exit \nEnter Your Choice:- ");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				es.insertEmp();
				break;
			case 2:
				es.removeEmployee();
				break;
				
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				sc.close();
				System.out.println("Thank You For Visiting...");
				break;
				
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			
			
		}while (choice!=8);
	}

}

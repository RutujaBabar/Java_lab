package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeImpt;
import com.demo.service.employeeInterface;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//create EmployeeImpt
		employeeInterface semp = new EmployeeImpt();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
		System.out.println("1) Insert Employee : \n"
				         + "2) Remove Employee : \n"
				         + "3) Print Queue : \n "
				         + "4) Print all female employees : \n"
				         + "5) Print all male employees : \n"
				         + "6) Empty Queue using recursion : \n"
				         + "7) Print Queue in reverse order : \n"
				         + "8) Exit : \n"
				         + "Enter your choice");
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			semp.insertdata();
			break;
		case 2:
			System.out.println("Enter id to remove data : ");
			int id = sc.nextInt();
			semp.removeemp(id);
			break;
		case 3:
			semp.displaydata();
			break;
		case 4:
			semp.displayfemaledata();
			break;
		case 5:
			semp.displaymaledata();
			break;
		case 6:
			semp.emptyqueuerecursionnn();
			
			break;
		case 7:
			semp.queueinreverse();
			break;
		case 8:
			System.out.println("Exit");
			sc.close();
			break;
		}
		}while(choice!=8);

	
	}
}

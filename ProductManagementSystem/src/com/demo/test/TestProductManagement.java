package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductManagement {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService pservice = new ProductServiceImpl();
		int choice=0;
		
		do {
			System.out.println("1. Add new product\n 2. Display all\n 3. Display by id\n4. Display by name\n.5 Display by price \n6.Exit\n");
			//System.out.println("4. Display by name\n  5. Display by Price");
			
			choice = sc.nextInt();
			switch(choice)
			{
			
			case 1:
				boolean status = pservice.addNewProduct();
				if(status)
				{
				  System.out.println("Added Successfully");
				  
				}
				else
				{
					System.out.println("Not found");
				}
				break;
				
				
			case 2:
				
				List<Product> plist = pservice.displayAll();
				
				plist.stream().forEach(ob->System.out.println(ob));
				break;
				
			case 3:
				System.out.println("Enter id ");
				int pid=sc.nextInt();
				Product p = pservice.displayById(pid);
				if(p!=null)
				{
					System.out.println(p);
				}
				else
				{
					System.out.println("Not Found");
				}
				break;
			
				
			case 4:
				System.out.println("Enter name");
				String nm=sc.next();
				plist=pservice.displayByname(nm);
				plist.stream().forEach(ob->System.out.println(ob));				
			
				
				break;
				
			case 5:
				System.out.println("Enter price of product");
				float price=sc.nextFloat();
				plist=pservice.displayByPrice(price);
				plist.stream().forEach(ob->System.out.println(ob));
				
				break;
				
				
				
			
				
			case 6:
				sc.close();
				System.out.println("Thank you for visiting!!");
				break;
			default:
				System.out.println("invalid choice");
				break;
				
			
				
			 
			 
			}
		}while(choice!=6);
	}

}

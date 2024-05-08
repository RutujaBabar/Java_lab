package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
//import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	
	private ProductDao pdao;
	
	
	public ProductServiceImpl() {
		super();
		pdao=new ProductDaoImpl();
	}


	public boolean addNewProduct() {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Product id");
		int pid = sc.nextInt();
		System.out.println("Enter product name");
		String nm= sc.next();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Price");
		float price = sc.nextFloat();
		Product p = new Product(pid, nm, qty, price);
		
		return pdao.save(p);
		
		
	}


	public List<Product> displayAll() {
		
		return pdao.findAll();
	}


	

	@Override
	public Product displayById(int pid) {
		
		return pdao.findById(pid);
	}


	@Override
	public List<Product> displayByname(String nm) {
		
		return pdao.findByName(nm);
	}


	@Override
	public List<Product> displayByPrice(float price) {
		
		return pdao.findByPrice(price);
	}


	

}

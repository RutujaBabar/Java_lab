package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{

	static List<Product> plist;
	
	
	static {
		plist = new ArrayList<>();
		plist.add(new Product(1,"lays",34,45));
		plist.add(new Product(2,"Marie",34,20));
		plist.add(new Product(3,"Maggi",40,50));
	}
	
	
	public boolean save(Product p) {
		return plist.add(p);
	}


	public List<Product> findAll() {
		
		return plist;
	}


	public Product findById(int pid) {
		int pos = plist.indexOf(new Product(pid));
		if(pos!=-1) 
		{
			return plist.get(pos);
		}
		return null;
	}


	@Override
	public List<Product> findByName(String nm) {
		
		List<Product> lst = plist.stream()
				.filter(ob->ob.getName().equals(nm))
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}


	@Override
	public List<Product> findByPrice(float price) {
		
		
		List<Product> lst=plist.stream().filter(ob->ob.getPrice()>price).collect(Collectors.toList());
		
		if(lst.isEmpty())
		{
			return null;
		}
		return lst;
	}
			
		
}


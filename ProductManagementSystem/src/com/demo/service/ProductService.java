package com.demo.service;


import java.util.List;
import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> displayAll();

	Product displayById(int pid);

	List<Product> displayByname(String nm);

	List<Product> displayByPrice(float price);

}

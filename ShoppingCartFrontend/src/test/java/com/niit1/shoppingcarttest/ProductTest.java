package com.niit1.shoppingcarttest;

import com.niit1.shoppingcartfrontend.Product;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(100);
		p1.setName("iphone");
		p1.setPrice(15000);
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
	
		
	}	
	}

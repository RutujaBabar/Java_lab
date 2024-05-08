package com.demo.beans;

public class Product {

		private int pid;
		private String name;
		private int qty;
		private float price;
		
		public Product() {
			super();
		}
		
		
		public Product(int pid) {
			super();
			this.pid = pid;
		}


		public Product(int pid, String name, int qty, float price) {
			super();
			this.pid = pid;
			this.name = name;
			this.qty = qty;
			this.price = price;
		}
		
		
		public boolean equals(Object obj) {
			Product other=((Product)obj);
			System.out.println("in Product equals method"+this.pid+"---->"+other.pid);
			return this.pid==other.pid;
		}
		
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty
					+ ", price=" + price + "]";
		}

	    	
	}




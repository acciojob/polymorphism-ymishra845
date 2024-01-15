package com.driver;

public class Main {

public static  class Product{
		
		public int Product(int x,int y) {
			
			return x*y;
			
		}
		public int Product(int x,int y,int z) {
			
			return x*y*z;
		}
		
		public double product(double x, double y) {
			return x*y;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p= new Product();
		p.Product(5, 6);
		p.Product(6 , 7, 8);
		p.product(9, 9);
		
	}

}

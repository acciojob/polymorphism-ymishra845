package com.driver;

public class Main {

    public static class Product {

        // Rename methods to start with lowercase letters for proper method naming convention
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Rename method to start with lowercase letter for proper method naming convention
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Product p = new Product();
        p.product(5, 6);          // Corrected method name
        p.product(6, 7, 8);       // Corrected method name
        p.product(9.0, 9.0);      // Corrected method name
    }
}
